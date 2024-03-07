# InsureMO AppFramework BFF

This is a template project based on SpringBoot framework. <br>
The ***release*** branch is the latest stable version. 
We recommend you fork the whole repository rather than main branch only.

While you are getting code samples and forked from the appframework ready, please note the following points for branch management:
- The release branch of appframework template will be updated periodically. Remember to perform ***sync fork*** based on your needs.
- Do not directly push your commits on the release branch, as "sync fork" will discard your origin commits. Instead, create your own branch for development and merge ***release*** to it.

## Prerequisite
First, set up CICD jobs on InsureMO portal. There are two ways:
- Way.1: Send email to siteops@ebaotech.com to create job for you.
- Way.2: Follow [Create CICD job](#jump) to create job yourself.

Modify project files as follows:
- Modify **tenant code**. Replace all the **ebaogi** words with your own tenant code. Files to be changed are:
  - configCenter.json
  - insuremo-service-app/pom.xml
  - insuremo-service-common/pom.xml
  - insuremo-service-database/pom.xml
  - insuremo-service-common/src/main/resources/application-module.properties
- Modify **application name**. Replace all the **appframework-bff-app** words with your own CICD job name. Files to be changed are:
  - pom.xml
  - configCenter.json
  - insuremo-service-common/src/main/resources/application-module.properties
- Modify maven **artifactId**,**groupId** according to your needs. In order not to damage the project structure, we recommend that you change the appframework-bff word to a custom name, and keep the rest unchanged. Files are:
  - pom.xml
  - insuremo-service-app/pom.xml
  - insuremo-service-common/pom.xml
  - insuremo-service-database/pom.xml

- You will get a new and runnable code after finishing the above steps.

## Local development requirements

### Step 1: Install JDK -> **Java 11**
  - The docker image uses **Java 11** by default
  - The template code uses some features since Java 9
  > For the above reasons, **Java 11** is recommended for local development. Other Java versions will fail.

### Step 2: Install maven for dependency management
> You need to install maven locally in order to run the mvn command successfuly.

### Step 3: Install git for source code versioning

### Step 4: Create token for access to InsureMO Config Center

The application needs to connect to the ***Config Center*** to load init config data when it runs locally, so you need to generate access token to connect to ***Config Center***.</br>
Follow the steps below:
- Login in [InsureMO Portal](https://portal.insuremo.com/) and access My Console.
- Scroll down to the Runtime section, find your runtime environment (typically it's sg_sdb), then click the API Management link in the toolbar. This will bring you to a new page(typically https://sandbox-2-sg.insuremo.com/), then click utility-and-admin -> API Management.
- In the API management screen, click ***Access Token Management*** on the left side.
- Click button ***Create*** to create token. 
- Save the token, we will use it later.
> **DO NOT** delete tokens created by others.

### Step 5: Upload application config into InsureMO Config Center
- Contact your training team to get the jdbc info for sdb environment and update to ***./configCenter.json***. <br>
- Import ***./configCenter.json*** to InsureMO portal ***Config Center***. Steps are as follows:
  - Scroll down to the Runtime section, find your runtime environment (typically it's sg_sdb), then click Config Center link in the toolbar.
  - Click Import button, select your ***./configCenter.json*** file and start upload.
- Deploy the config center data to corresponding runtime environment. Steps are as follows:
  - Click the left menu ***Utility And Admin***-> ***DevOps*** -> ***CICD***.
  - Search for ```configcenter-data``` service name and click in Actions -> CICD.
  - Select Build & Deploy as actions, your runtime environment (typically it's sg_sdb) as Target Environment, leave other inputs blank, then submit the CI/CD to be triggered.
  - Click in menu Build History and Deployment History to check the ***configcenter-data*** service status. Success status represents that you have uploaded your application config to the runtime environment.

### Step 6: Running locally

- Run ```./mvn install``` to download all dependence jar.
- Configure below environment variables before you run ***App.java***.<br>
```
insuremo_access_token=Bearer xxxxx;insuremo_gw_url=https://sandbox-2-sg-gw.insuremo.com;spring.profiles.active=local;TENANT_CODE=xxxxx     

# set spring.profiles.active=local to enable local profile application-local.properties to local development purpose
# insuremo_access_token value is we just created it with above steps.
# the https://sandbox-2-sg-gw.insuremo.com here is for sg_sdb environment   
```
> These environment variables are required parameters to read data from config center.
> Please make sure with Bearer as the token prefix, the xxxxx should be replaced with the real token
- Run  ***App.java***.

- Navigate to [http://localhost:80/test/testbff](http://localhost:80/test/testbff) in your browser.

- Once the app starts successfully, delete ***./configCenter.json*** at local and commit it.
 > For security consideration, please **DO NOT** commit sensitive data into source, e.g. token, database credentials etc.

## Setup CICD jobs on InsureMO
> You need to push your local commit to origin repository first.

There will be two jobs setup in DevOps to build your app and deploy to InsureMO runtime. One for service and the other for database scripts deployment. Please follow the setup steps below.<br>

<span id="jump"></span>
### Create CICD job
- Start by login to [insuremo portal](https://portal.insuremo.com/#/home/utility-and-admin/devOps) and go to DevOps -> CICD.   <br>
- Find your tenant and Click ```Quick Create``` button. <br>
- Fill in below infomation
1. ```Template``` with bff template, please fill in ```insuremo-standard-service```
2. ```Service Name``` with bff service name(naming rule:"repoName"-service)
3. ```Repository URL``` with github repo path
4. ```User Name``` with github email account
5. ```Access Token``` with github account token, [click here](https://github.com/settings/tokens) and generate personal access token

### Build and deploy CICD job
- After performing all these above mentioned steps you will have two jobs, one of service job and the other of database scripts job. 
- Find the service and database scripts jobs and select CICD option from Actions drop down. 
- Select Build & Deploy, your dev branch, your runtime environment (typically it's sdb), and then submit the CI/CD to be triggered.
- Click in menu Build History and Deployment History to check the job status.

## Template file directory structure

```markdown
root
├── docs      # all doc files for current project, a postman collection and envs files already exists.
├── insuremo-service-app  #Do not modify the directory path name
│    └── src
│        └── main
│            ├── java
│            │   └── com
│            │       └── ebao
│            │           └── cloud
│            │               ├── config
│            │               │   └── DatabaseConfiguration.java     #JPA scan configuration
│            │               │   └── Swagger3Configuration.java     #Openapi configuration
│            │               ├── controller
│            │               │   ├── ProposalController.java        #Sample logic for proposal flow ,you can change it with your │business.
│            │               │   ├── SwaggerController.java         #Provide swagger.json to Portal to register API, not suggest │changing it.
│            │               │   └── TestController.java            #Api for test
│            │               └── App.java
│
│── insuremo-service-common
│    └── src
│        └── main
│           └── java
│                └── com
│                    └── ebao
│                        └── cloud
│                            ├── domain               # JPA Entity classes
│                            ├── integration          # Integration Service or client 
│                            ├── repository           # Repository level
│                            └── service              # Service level
|            └── resources
│                ├── application.properties           # Application configuration file
│                ├── application-local.properties     # Application profile configuration file for local development
│                └── logback-spring.xml               # logging configuration
|
└── insuremo-service-database  #Do not modify the directory path name
     └── src
         ├── main
         │   └── java                                 # It is not recommended to modify the files in this directory
         │   └── resources
         │       ├── dbscript                         # Add your new changelog file
         │       └── META-INF
         │           └── database-module.properties   # database module configuration file
         │
         └── test                                     # Liquibase examples for quickstart
```


## Manage database schema changes

Use an open source tool [liquibase](https://portal.insuremo.com/) to manager any schema change.
- Version control based on changeset for database changes, and standardized development
- One set of scripts supports multiple databases simultaneously, including MySQL, Oracle, and SQLServer.
- Pre-condition check for safety migration
- Repeatable migrations by CSV file, no need to care about insert or update
- Special control for migration that only applicable for specified database

In order to maintain liquibase scripts:
- db.changelog-master.xml as Liquibase scripts master and include scripts in the relative path, by migration order
- Folders can be created based on the application version, under ./insuremo-service-database/src/main/resources/dbscript
- Each folder has an index.xml to organize scripts properly
- The db.changelog-master.xml includes all folders’ index.xml by order
- Build and deploy scripts with CICD job ${serviceName}-dbasset. 

More detail info about how to use liquibase refer to office [quickstart](https://www.liquibase.org/get-started#how) .
Know more about liquibase usage [best practices](https://docs.liquibase.com/concepts/bestpractices.html).

## Links
- [InsureMO Portal](https://portal.insuremo.com/)
- [InsureMO Config Center](https://portal.insuremo.com/#/home/utility-and-admin/configcenter)
- [InsureMO CICD](https://portal.insuremo.com/#/home/utility-and-admin/devOps)
- [liquibase Website](https://www.liquibase.org/), and [quickstart](https://www.liquibase.org/get-started/quickstart)

