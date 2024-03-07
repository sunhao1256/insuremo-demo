/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.quotation.output;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;

/**
 * Auto-generated: 2023-03-15 16:52:51
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Coverages {

    private ExtendedProps extendedProps;
    private int coverageSerialId;
    private String coverageNo;
    private String productCode;
    private long sumAssured;
    private int grossPremium;
    private int premium;
    private int premiumAn;
    private int discntedPremAn;
    private int insuredAge;
    private int unit;
    private List<String> extraPrems;
    private List<String> coverageLiabilities;
    public void setExtendedProps(ExtendedProps extendedProps) {
         this.extendedProps = extendedProps;
     }
     public ExtendedProps getExtendedProps() {
         return extendedProps;
     }

    public void setCoverageSerialId(int coverageSerialId) {
         this.coverageSerialId = coverageSerialId;
     }
     public int getCoverageSerialId() {
         return coverageSerialId;
     }

    public void setCoverageNo(String coverageNo) {
         this.coverageNo = coverageNo;
     }
     public String getCoverageNo() {
         return coverageNo;
     }

    public void setProductCode(String productCode) {
         this.productCode = productCode;
     }
     public String getProductCode() {
         return productCode;
     }

    public void setSumAssured(long sumAssured) {
         this.sumAssured = sumAssured;
     }
     public long getSumAssured() {
         return sumAssured;
     }

    public void setGrossPremium(int grossPremium) {
         this.grossPremium = grossPremium;
     }
     public int getGrossPremium() {
         return grossPremium;
     }

    public void setPremium(int premium) {
         this.premium = premium;
     }
     public int getPremium() {
         return premium;
     }

    public void setPremiumAn(int premiumAn) {
         this.premiumAn = premiumAn;
     }
     public int getPremiumAn() {
         return premiumAn;
     }

    public void setDiscntedPremAn(int discntedPremAn) {
         this.discntedPremAn = discntedPremAn;
     }
     public int getDiscntedPremAn() {
         return discntedPremAn;
     }

    public void setInsuredAge(int insuredAge) {
         this.insuredAge = insuredAge;
     }
     public int getInsuredAge() {
         return insuredAge;
     }

    public void setUnit(int unit) {
         this.unit = unit;
     }
     public int getUnit() {
         return unit;
     }

    public void setExtraPrems(List<String> extraPrems) {
         this.extraPrems = extraPrems;
     }
     public List<String> getExtraPrems() {
         return extraPrems;
     }

    public void setCoverageLiabilities(List<String> coverageLiabilities) {
         this.coverageLiabilities = coverageLiabilities;
     }
     public List<String> getCoverageLiabilities() {
         return coverageLiabilities;
     }

}
