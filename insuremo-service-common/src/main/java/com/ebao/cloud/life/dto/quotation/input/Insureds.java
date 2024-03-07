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
public class Insureds {


    private int partySerialId;
    private int relationToPH;

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

}
