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
public class Payers {

    private int partySerialId;
    private int relationToPH;
    private int shareRate;
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

    public void setShareRate(int shareRate) {
         this.shareRate = shareRate;
     }
     public int getShareRate() {
         return shareRate;
     }

}
