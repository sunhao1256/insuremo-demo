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
public class Address {

    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String postCode;
    public void setAddress1(String address1) {
         this.address1 = address1;
     }
     public String getAddress1() {
         return address1;
     }

    public void setAddress2(String address2) {
         this.address2 = address2;
     }
     public String getAddress2() {
         return address2;
     }

    public void setAddress3(String address3) {
         this.address3 = address3;
     }
     public String getAddress3() {
         return address3;
     }

    public void setAddress4(String address4) {
         this.address4 = address4;
     }
     public String getAddress4() {
         return address4;
     }

    public void setPostCode(String postCode) {
         this.postCode = postCode;
     }
     public String getPostCode() {
         return postCode;
     }

}
