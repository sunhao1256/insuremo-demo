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
public class Beneficiaries {

    private int partySerialId;
    private int insuredPartySerialId;
    private int beneType;
    private int designation;
    private int shareOrder;
    private int shareRate;
    public void setPartySerialId(int partySerialId) {
         this.partySerialId = partySerialId;
     }
     public int getPartySerialId() {
         return partySerialId;
     }

    public void setInsuredPartySerialId(int insuredPartySerialId) {
         this.insuredPartySerialId = insuredPartySerialId;
     }
     public int getInsuredPartySerialId() {
         return insuredPartySerialId;
     }

    public void setBeneType(int beneType) {
         this.beneType = beneType;
     }
     public int getBeneType() {
         return beneType;
     }

    public void setDesignation(int designation) {
         this.designation = designation;
     }
     public int getDesignation() {
         return designation;
     }

    public void setShareOrder(int shareOrder) {
         this.shareOrder = shareOrder;
     }
     public int getShareOrder() {
         return shareOrder;
     }

    public void setShareRate(int shareRate) {
         this.shareRate = shareRate;
     }
     public int getShareRate() {
         return shareRate;
     }

}
