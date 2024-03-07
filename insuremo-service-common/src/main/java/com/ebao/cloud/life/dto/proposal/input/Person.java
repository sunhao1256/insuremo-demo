/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.input;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;

/**
 * Auto-generated: 2023-03-16 10:4:27
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Person {

    private String gender;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date birthdate;
    private int certiType;
    private String certiCode;
    private String firstName;
    private String lastName;
    private String nationality;
    private String preferredLifeIndi;
    private String smoking;
    private String occupationCode;
    private String marriageStatus;
    private String employedIndi;
    public void setGender(String gender) {
         this.gender = gender;
     }
     public String getGender() {
         return gender;
     }

    public void setBirthdate(Date birthdate) {
         this.birthdate = birthdate;
     }
     public Date getBirthdate() {
         return birthdate;
     }

    public void setCertiType(int certiType) {
         this.certiType = certiType;
     }
     public int getCertiType() {
         return certiType;
     }

    public void setCertiCode(String certiCode) {
         this.certiCode = certiCode;
     }
     public String getCertiCode() {
         return certiCode;
     }

    public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     public String getFirstName() {
         return firstName;
     }

    public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     public String getLastName() {
         return lastName;
     }

    public void setNationality(String nationality) {
         this.nationality = nationality;
     }
     public String getNationality() {
         return nationality;
     }

    public void setPreferredLifeIndi(String preferredLifeIndi) {
         this.preferredLifeIndi = preferredLifeIndi;
     }
     public String getPreferredLifeIndi() {
         return preferredLifeIndi;
     }

    public void setSmoking(String smoking) {
         this.smoking = smoking;
     }
     public String getSmoking() {
         return smoking;
     }

    public void setOccupationCode(String occupationCode) {
         this.occupationCode = occupationCode;
     }
     public String getOccupationCode() {
         return occupationCode;
     }

    public void setMarriageStatus(String marriageStatus) {
         this.marriageStatus = marriageStatus;
     }
     public String getMarriageStatus() {
         return marriageStatus;
     }

    public void setEmployedIndi(String employedIndi) {
         this.employedIndi = employedIndi;
     }
     public String getEmployedIndi() {
         return employedIndi;
     }

}
