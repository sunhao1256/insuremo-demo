/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.output;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;
import java.util.Date;

/**
 * Auto-generated: 2023-03-16 10:5:28
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
    private double grossPremium;
    private double premium;
    private int premiumAn;
    private double discntedPremAn;
    private int insuredAge;
    private int unit;
    private List<ExtraPrems> extraPrems;
    private List<String> coverageLiabilities;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date paidupDate;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date expiryDate;
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

    public void setGrossPremium(double grossPremium) {
         this.grossPremium = grossPremium;
     }
     public double getGrossPremium() {
         return grossPremium;
     }

    public void setPremium(double premium) {
         this.premium = premium;
     }
     public double getPremium() {
         return premium;
     }

    public void setPremiumAn(int premiumAn) {
         this.premiumAn = premiumAn;
     }
     public int getPremiumAn() {
         return premiumAn;
     }

    public void setDiscntedPremAn(double discntedPremAn) {
         this.discntedPremAn = discntedPremAn;
     }
     public double getDiscntedPremAn() {
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

    public void setExtraPrems(List<ExtraPrems> extraPrems) {
         this.extraPrems = extraPrems;
     }
     public List<ExtraPrems> getExtraPrems() {
         return extraPrems;
     }

    public void setCoverageLiabilities(List<String> coverageLiabilities) {
         this.coverageLiabilities = coverageLiabilities;
     }
     public List<String> getCoverageLiabilities() {
         return coverageLiabilities;
     }

    public void setPaidupDate(Date paidupDate) {
         this.paidupDate = paidupDate;
     }
     public Date getPaidupDate() {
         return paidupDate;
     }

    public void setExpiryDate(Date expiryDate) {
         this.expiryDate = expiryDate;
     }
     public Date getExpiryDate() {
         return expiryDate;
     }

}
