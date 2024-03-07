/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.output;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Auto-generated: 2023-03-16 10:5:28
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class CustomersInfo {

    private ExtendedProps extendedProps;
    private long partySerialId;
    private String customerNo;
    public void setExtendedProps(ExtendedProps extendedProps) {
         this.extendedProps = extendedProps;
     }
     public ExtendedProps getExtendedProps() {
         return extendedProps;
     }

    public void setPartySerialId(long partySerialId) {
         this.partySerialId = partySerialId;
     }
     public long getPartySerialId() {
         return partySerialId;
     }

    public void setCustomerNo(String customerNo) {
         this.customerNo = customerNo;
     }
     public String getCustomerNo() {
         return customerNo;
     }

}
