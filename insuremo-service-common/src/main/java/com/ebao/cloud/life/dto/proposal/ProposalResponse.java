/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal;
import com.ebao.cloud.life.dto.proposal.output.CustomersInfo;
import com.ebao.cloud.life.dto.proposal.output.Policy;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2023-03-16 10:5:28
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class ProposalResponse {

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date clientRequestTime;
    private int result;
    private String traceId;
    private Policy policy;
    private List<CustomersInfo> customersInfo;
    public void setClientRequestTime(Date clientRequestTime) {
         this.clientRequestTime = clientRequestTime;
     }
     public Date getClientRequestTime() {
         return clientRequestTime;
     }

    public void setResult(int result) {
         this.result = result;
     }
     public int getResult() {
         return result;
     }

    public void setTraceId(String traceId) {
         this.traceId = traceId;
     }
     public String getTraceId() {
         return traceId;
     }

    public void setPolicy(Policy policy) {
         this.policy = policy;
     }
     public Policy getPolicy() {
         return policy;
     }

    public void setCustomersInfo(List<CustomersInfo> customersInfo) {
         this.customersInfo = customersInfo;
     }
     public List<CustomersInfo> getCustomersInfo() {
         return customersInfo;
     }

}
