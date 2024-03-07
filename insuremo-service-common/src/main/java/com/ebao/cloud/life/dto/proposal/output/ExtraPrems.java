/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.output;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Auto-generated: 2023-03-16 10:5:28
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class ExtraPrems {

    private ExtendedProps extendedProps;
    private String extraType;
    private String extraArith;
    private int extraPrem;
    private int extraPremAn;
    private int extraPara;
    public void setExtendedProps(ExtendedProps extendedProps) {
         this.extendedProps = extendedProps;
     }
     public ExtendedProps getExtendedProps() {
         return extendedProps;
     }

    public void setExtraType(String extraType) {
         this.extraType = extraType;
     }
     public String getExtraType() {
         return extraType;
     }

    public void setExtraArith(String extraArith) {
         this.extraArith = extraArith;
     }
     public String getExtraArith() {
         return extraArith;
     }

    public void setExtraPrem(int extraPrem) {
         this.extraPrem = extraPrem;
     }
     public int getExtraPrem() {
         return extraPrem;
     }

    public void setExtraPremAn(int extraPremAn) {
         this.extraPremAn = extraPremAn;
     }
     public int getExtraPremAn() {
         return extraPremAn;
     }

    public void setExtraPara(int extraPara) {
         this.extraPara = extraPara;
     }
     public int getExtraPara() {
         return extraPara;
     }

}
