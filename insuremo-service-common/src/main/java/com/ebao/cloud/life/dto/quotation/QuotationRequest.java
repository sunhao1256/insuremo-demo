/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.quotation;

import com.ebao.cloud.life.dto.quotation.input.Policy;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Auto-generated: 2023-03-15 16:41:56
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class QuotationRequest {

    private Policy policy;
    public void setPolicy(Policy policy) {
         this.policy = policy;
     }
     public Policy getPolicy() {
         return policy;
     }

}
