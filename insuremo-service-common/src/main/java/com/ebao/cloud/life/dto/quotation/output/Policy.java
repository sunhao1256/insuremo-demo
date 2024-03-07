/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.quotation.output;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2023-03-15 16:52:51
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Policy {

    private ExtendedProps extendedProps;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date inceptionDate;
    private int installPrem;
    private List<Coverages> coverages;
    private List<String> premTaxes;
    public void setExtendedProps(ExtendedProps extendedProps) {
         this.extendedProps = extendedProps;
     }
     public ExtendedProps getExtendedProps() {
         return extendedProps;
     }

    public void setInceptionDate(Date inceptionDate) {
         this.inceptionDate = inceptionDate;
     }
     public Date getInceptionDate() {
         return inceptionDate;
     }

    public void setInstallPrem(int installPrem) {
         this.installPrem = installPrem;
     }
     public int getInstallPrem() {
         return installPrem;
     }

    public void setCoverages(List<Coverages> coverages) {
         this.coverages = coverages;
     }
     public List<Coverages> getCoverages() {
         return coverages;
     }

    public void setPremTaxes(List<String> premTaxes) {
         this.premTaxes = premTaxes;
     }
     public List<String> getPremTaxes() {
         return premTaxes;
     }

}
