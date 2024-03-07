/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.quotation;
import com.ebao.cloud.life.dto.quotation.output.Policy;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;

/**
 * Auto-generated: 2023-03-15 16:52:51
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class QuotationResponse {

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date clientRequestTime;
    private int result;
    private String traceId;
    private Policy policy;
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

}
