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
public class PayerAccounts {

    private int paymentMethod;
    private int paymentMethodNext;
    public void setPaymentMethod(int paymentMethod) {
         this.paymentMethod = paymentMethod;
     }
     public int getPaymentMethod() {
         return paymentMethod;
     }

    public void setPaymentMethodNext(int paymentMethodNext) {
         this.paymentMethodNext = paymentMethodNext;
     }
     public int getPaymentMethodNext() {
         return paymentMethodNext;
     }

}
