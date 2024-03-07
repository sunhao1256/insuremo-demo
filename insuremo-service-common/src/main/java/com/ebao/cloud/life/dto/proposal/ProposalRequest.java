/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal;
import com.ebao.cloud.life.dto.proposal.input.Collection;
import com.ebao.cloud.life.dto.proposal.input.Policy;
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
public class ProposalRequest {

    private String clientRequestId;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date clientRequestTime;
    private Policy policy;
    private Collection collection;
    public void setClientRequestId(String clientRequestId) {
         this.clientRequestId = clientRequestId;
     }
     public String getClientRequestId() {
         return clientRequestId;
     }

    public void setClientRequestTime(Date clientRequestTime) {
         this.clientRequestTime = clientRequestTime;
     }
     public Date getClientRequestTime() {
         return clientRequestTime;
     }

    public void setPolicy(Policy policy) {
         this.policy = policy;
     }
     public Policy getPolicy() {
         return policy;
     }

    public void setCollection(Collection collection) {
         this.collection = collection;
     }
     public Collection getCollection() {
         return collection;
     }

}
