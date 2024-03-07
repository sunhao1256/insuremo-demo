/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.input;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Auto-generated: 2023-03-16 10:4:27
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Insureds {

    private int partySerialId;
    private int relationToPH;
    private String medicalIndi;
    private String socialSecurityIndi;
    private String medicalExamIndi;
    private int orderId;

    public int getOrderId() {
      return orderId;
    }

    public void setOrderId(int orderId) {
      this.orderId = orderId;
    }

    public void setPartySerialId(int partySerialId) {
           this.partySerialId = partySerialId;
       }
     public int getPartySerialId() {
         return partySerialId;
     }

    public void setRelationToPH(int relationToPH) {
         this.relationToPH = relationToPH;
     }
     public int getRelationToPH() {
         return relationToPH;
     }

    public void setMedicalIndi(String medicalIndi) {
         this.medicalIndi = medicalIndi;
     }
     public String getMedicalIndi() {
         return medicalIndi;
     }

    public void setSocialSecurityIndi(String socialSecurityIndi) {
         this.socialSecurityIndi = socialSecurityIndi;
     }
     public String getSocialSecurityIndi() {
         return socialSecurityIndi;
     }

    public void setMedicalExamIndi(String medicalExamIndi) {
         this.medicalExamIndi = medicalExamIndi;
     }
     public String getMedicalExamIndi() {
         return medicalExamIndi;
     }

}
