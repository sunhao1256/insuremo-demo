/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.input;
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
public class ExtraPrems {

    private String extraArith;
    private int extraPara;
    private String extraType;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date startDate;
    public void setExtraArith(String extraArith) {
         this.extraArith = extraArith;
     }
     public String getExtraArith() {
         return extraArith;
     }

    public void setExtraPara(int extraPara) {
         this.extraPara = extraPara;
     }
     public int getExtraPara() {
         return extraPara;
     }

    public void setExtraType(String extraType) {
         this.extraType = extraType;
     }
     public String getExtraType() {
         return extraType;
     }

    public void setStartDate(Date startDate) {
         this.startDate = startDate;
     }
     public Date getStartDate() {
         return startDate;
     }

}
