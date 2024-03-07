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
