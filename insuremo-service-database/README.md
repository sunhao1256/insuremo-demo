# InsureMO AppFramework Liquibase Guide

## Introduction
This is a quick guide to help you get familiar with the liquibase. Liquibase is a database schema change management solution that enables you to revise and release database changes faster and safer from development to production.
In this project, we use Liquibase with Spring Boot to create and configure standalone Spring applications and automate your database updates. 
The Liquibase Spring Boot integration ensures the application database is updated along with the application code by using Spring Boot autoconfiguration and features.

## General Practices

### Define the directory structure.
The most common way to organize your changelogs is by major release. Make certain directories to store changelogs in your source control.
The following example specifies the directory resources/dbscript to maintain all the database scripts, and each subdirectory corresponding to major release version.

```
dbscript
  db.changelog-master.xml
  1.0.0
    index.xml
    20220701_permission_ddl.xml
    20220702_permission_dml.xml
    20220702_permission_data.csv
  1.0.1
    index.xml
    20220720_user_dml.xml
```

### Set up the root changelog and the included changelog files.
The root changelog file db.changelog-master.xml is passed to all Liquibase calls.
When new version files need to be created:
- create a directory with version name to store scripts of that version
- create an index.xml to include scripts properly
- update db.changelog-master.xml with the new include files.

> Use relativeToChangelogFile="true" in &lt;include&gt; and &lt;loadUpdateData&gt; 
```
<!-- in db.changelog-master.xml -->
<include relativeToChangelogFile="true" file="dbscript/1.0.0/index.xml"/>
<include relativeToChangelogFile="true" file="dbscript/1.0.1/index.xml"/>

<!-- in 1.0.0/index.xml -->
<include relativeToChangelogFile="true" file="20220701_permission_ddl.xml"/>
<include relativeToChangelogFile="true" file="20220702_permission_dml.xml"/>

<!-- in 1.0.0/20220702_permission_dml.xml-->
<loadUpdateData encoding="UTF-8" file="20220702_permission_data.csv" relativeToChangelogFile="true" primaryKey="id" quotchar="&quot;" separator="," tableName="T_PERMISSION">
```

### Prefer XML rather than pure SQL
Liquibase supports the inclusion of changelogs in the following formats:
- SQL – Use SQL if you are familiar with it and do not want to learn a new way to specify database changes.
- Markup – Use a markup language like XML, JSON, or YAML to accomplish any of the following tasks:
    - Automate the rollback of new database objects
    - Simplify the deployment a single set of changes to different types of databases
    - Improve Hub and db-doc reporting

> Recommend using XML rather sql to support multi-types of database and rollback, e.g. Oracle, MySql, SQLServer

### Specify one change per changeset.
Unless you are grouping several changes as a single transaction, we strongly encourage you to specify only one change per changeset. This approach makes each change atomic within a single transaction.
Each changeset either succeeds or fails. If it fails, it can be corrected and redeployed until it succeeds. 
Multiple independent changes in a single changeset introduce the risk that some changes deploy while a later change fails, leaving the database in a partially deployed state.


### Support Rollback
Always have &lt;preConditions&gt; in DDL changeset. If your change don't support auto rollback, please use &lt;rollback&gt; tag in changeset.

### Define the team's changeset ID format.
Choose a changeset ID that is unique within its changelog. We recommend that you use a pattern to generate ID, e.g. combination rule:
- primary object name, table name
- changeset headline
- date and sequence

example:
```
id="T_PUB_CONTEXT_TYPE.rename_column_productId.20220701001"

id="T_PUB_CONTEXT_TYPE-rename_column_productId-20220701001"
```

### Database Object Naming Case Sensitivity
SQL keyword is case-insensitive, but database object name in some types of database is case-sensitive, e.g.  SQLServer is case-sensitive.
Always keep naming consistent (recommend using uppercase name) in all liquibase scripts, for table name, column name, index name, constraint names etc. 

### Data Types
Some recommends for data types:
- DECIMAL for numeric column, e.g. DECIMAL(15) for primary/foreign key column
- VARCHAR/CHAR for string column
- DATETIME for date/datetime
- Don't use boolean column, use CHAR(1) to store Y/N

### Date/Time format
Liquibase initially sets the date format to yyyy-MM-dd'T'HH:mm:ss and then it checks for two special cases which will override the data format string:

If the string representing the date/time includes a period (.), then the date format is changed to yyyy-MM-dd'T'HH:mm:ss.SSS.
If the string representing the date/time includes a space, then the date format is changed to yyyy-MM-dd HH:mm:ss.
Once the date format string is set, Liquibase will then call the SimpleDateFormat.parse() method attempting to parse the input string so that it can return a date/time.

### Use [&lt;loadUpdateData&gt;](https://docs.liquibase.com/change-types/load-update-data.html) for DML data
Use &lt;loadUpdateData&gt; for file include, e.g. 
```
<changeSet author="generated" id="t_pub_module.DATA.20210603">
   <preConditions onFail="MARK_RAN">
       <sqlCheck expectedResult="0">select count(*) from T_PUB_MODULE where CODE = 'EASY_CLAIM'</sqlCheck>
   </preConditions>
   <loadUpdateData encoding="UTF-8" file="T_PUB_MODULE.csv" primaryKey="MODULE_ID" quotchar="&quot;" separator="," relativeToChangelogFile="true" tableName="T_PUB_MODULE">
       <column header="MODULE_ID" name="MODULE_ID" type="NUMERIC"/>
       <column header="CODE" name="CODE" type="STRING"/>
       <column header="NAME" name="NAME" type="STRING"/>
       <column header="DESCRIPTION" name="DESCRIPTION" type="STRING"/>
       <column header="INSERT_BY" name="INSERT_BY" type="NUMERIC"/>
       <column header="UPDATE_BY" name="UPDATE_BY" type="NUMERIC"/>
       <column header="RECORD_USAGE" name="RECORD_USAGE" type="NUMERIC"/>
       <column header="INSERT_TIME" name="INSERT_TIME" type="DATE"/>
       <column header="UPDATE_TIME" name="UPDATE_TIME" type="DATE"/>
       <column header="DYNAMIC_FIELDS" name="DYNAMIC_FIELDS" type="STRING"/>
   </loadUpdateData>
</changeSet>

```

## Use [&lt;logicalFilePath&gt;](https://docs.liquibase.com/concepts/changelogs/attributes/logicalfilepath.html) if you need move scripts.
If you're adapting appframework in an existing project, and some liquibase scripts have been executed in the runtime environment, in order to avoid errors that cased by filename check in liquibase, 
please use &lt;logicalFilePath&gt; attribute to specify the old file path in databaseChangeLog xml. 
Check the filename in existing runtime database table databasechangelog, e.g. bff-app-db/initdata/1.0.0/init_db.xml, and it is now resource/dbscript/1.0.0/init_db.xml
```
<databaseChangeLog logicalFilePath="bff-app-db/initdata/1.0.0/init_db.xml"
        xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-latest.xsd">
```
Above setting let's liquibase know that filename of all the changeset in this script is bff-app-db/initdata/1.0.0/init_db.xml.

## Liquibase Database Change Examples
This directory ```test/resources/dbscript``` contains a number of examples of how to manage database change with Liquibase.
The root changelog file ```db.changelog-master-test.xml``` includes all the Liquibase example scripts which are updated in an orderly manner with the start of ```DatabaseMigratorTest.class```.
Then you will see the new table and data in your database that you just created.
## Links
- Know more about Liquibase: [Getting Started with Liquibase](https://www.liquibase.org/get-started#how)
- For more change types: [Liquibase Change Types](https://docs.liquibase.com/change-types/home.html?__hstc=128893969.b4519e28db07c3ae59a83151a8579c37.1655690029739.1656299452730.1657677847687.14&__hssc=128893969.3.1657677847687&__hsfp=604157576&_ga=2.254632202.368072700.1657677834-1797974098.1655348598)
- For best practice: [Liquibase Best Practices](https://docs.liquibase.com/concepts/bestpractices.html)

