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
public class CurrentPremium {

    private String paymentFreq;
    private long sumAssured;
    public void setPaymentFreq(String paymentFreq) {
         this.paymentFreq = paymentFreq;
     }
     public String getPaymentFreq() {
         return paymentFreq;
     }

    public void setSumAssured(long sumAssured) {
         this.sumAssured = sumAssured;
     }
     public long getSumAssured() {
         return sumAssured;
     }

}
