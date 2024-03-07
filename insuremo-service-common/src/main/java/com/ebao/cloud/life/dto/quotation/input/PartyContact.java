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
public class PartyContact {

    private String mobileTel;
    private String email;
    public void setMobileTel(String mobileTel) {
         this.mobileTel = mobileTel;
     }
     public String getMobileTel() {
         return mobileTel;
     }

    public void setEmail(String email) {
         this.email = email;
     }
     public String getEmail() {
         return email;
     }

}
