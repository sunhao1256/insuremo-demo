/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.quotation.input;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Auto-generated: 2023-03-15 16:41:56
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class PolicyHolder {

    private int partySerialId;
    private int relationToLA;
    public void setPartySerialId(int partySerialId) {
         this.partySerialId = partySerialId;
     }
     public int getPartySerialId() {
         return partySerialId;
     }

    public void setRelationToLA(int relationToLA) {
         this.relationToLA = relationToLA;
     }
     public int getRelationToLA() {
         return relationToLA;
     }

}
