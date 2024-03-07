/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.quotation.input;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;

/**
 * Auto-generated: 2023-03-15 16:41:56
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Coverages {

    private int coverageSerialId;
    private String chargePeriod;
    private int chargeYear;
    private String coveragePeriod;
    private int coverageYear;
    private int deferPeriod;
    private String productCode;
    private CurrentPremium currentPremium;
    private List<Insureds> insureds;
    public void setCoverageSerialId(int coverageSerialId) {
         this.coverageSerialId = coverageSerialId;
     }
     public int getCoverageSerialId() {
         return coverageSerialId;
     }

    public void setChargePeriod(String chargePeriod) {
         this.chargePeriod = chargePeriod;
     }
     public String getChargePeriod() {
         return chargePeriod;
     }

    public void setChargeYear(int chargeYear) {
         this.chargeYear = chargeYear;
     }
     public int getChargeYear() {
         return chargeYear;
     }

    public void setCoveragePeriod(String coveragePeriod) {
         this.coveragePeriod = coveragePeriod;
     }
     public String getCoveragePeriod() {
         return coveragePeriod;
     }

    public void setCoverageYear(int coverageYear) {
         this.coverageYear = coverageYear;
     }
     public int getCoverageYear() {
         return coverageYear;
     }

    public void setDeferPeriod(int deferPeriod) {
         this.deferPeriod = deferPeriod;
     }
     public int getDeferPeriod() {
         return deferPeriod;
     }

    public void setProductCode(String productCode) {
         this.productCode = productCode;
     }
     public String getProductCode() {
         return productCode;
     }

    public void setCurrentPremium(CurrentPremium currentPremium) {
         this.currentPremium = currentPremium;
     }
     public CurrentPremium getCurrentPremium() {
         return currentPremium;
     }

    public void setInsureds(List<Insureds> insureds) {
         this.insureds = insureds;
     }
     public List<Insureds> getInsureds() {
         return insureds;
     }

}
