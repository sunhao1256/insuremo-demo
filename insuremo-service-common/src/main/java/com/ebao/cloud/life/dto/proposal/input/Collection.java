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
public class Collection {

    private int payMode;
    private int currency;
    private double feeAmount;
    public void setPayMode(int payMode) {
         this.payMode = payMode;
     }
     public int getPayMode() {
         return payMode;
     }

    public void setCurrency(int currency) {
         this.currency = currency;
     }
     public int getCurrency() {
         return currency;
     }

    public void setFeeAmount(double feeAmount) {
         this.feeAmount = feeAmount;
     }
     public double getFeeAmount() {
         return feeAmount;
     }

}
