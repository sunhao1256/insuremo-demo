/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.output;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2023-03-16 10:5:28
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Policy {

    private ExtendedProps extendedProps;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date inceptionDate;
    private String quotationCode;
    private int currency;
    private double installPrem;
    private List<Coverages> coverages;
    private List<String> premTaxes;
    private String proposalNumber;
    private String policyNumber;
    private int policyId;
    private int riskStatus;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date issueDate;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date expiryDate;
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

    public void setQuotationCode(String quotationCode) {
         this.quotationCode = quotationCode;
     }
     public String getQuotationCode() {
         return quotationCode;
     }

    public void setCurrency(int currency) {
         this.currency = currency;
     }
     public int getCurrency() {
         return currency;
     }

    public void setInstallPrem(double installPrem) {
         this.installPrem = installPrem;
     }
     public double getInstallPrem() {
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

    public void setProposalNumber(String proposalNumber) {
         this.proposalNumber = proposalNumber;
     }
     public String getProposalNumber() {
         return proposalNumber;
     }

    public void setPolicyNumber(String policyNumber) {
         this.policyNumber = policyNumber;
     }
     public String getPolicyNumber() {
         return policyNumber;
     }

    public void setPolicyId(int policyId) {
         this.policyId = policyId;
     }
     public int getPolicyId() {
         return policyId;
     }

    public void setRiskStatus(int riskStatus) {
         this.riskStatus = riskStatus;
     }
     public int getRiskStatus() {
         return riskStatus;
     }

    public void setIssueDate(Date issueDate) {
         this.issueDate = issueDate;
     }
     public Date getIssueDate() {
         return issueDate;
     }

    public void setExpiryDate(Date expiryDate) {
         this.expiryDate = expiryDate;
     }
     public Date getExpiryDate() {
         return expiryDate;
     }

}
