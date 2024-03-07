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
public class PolicyHolder {

    private ExtendedProps extendedProps;
    private int partySerialId;
    private int relationToLA;
    public void setExtendedProps(ExtendedProps extendedProps) {
         this.extendedProps = extendedProps;
     }
     public ExtendedProps getExtendedProps() {
         return extendedProps;
     }

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
