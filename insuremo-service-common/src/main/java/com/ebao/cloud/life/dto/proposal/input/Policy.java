/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.input;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2023-03-16 10:4:27
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Policy {

    private int policyType;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date applyDate;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date submissionDate;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date inceptionDate;
    private String quotationCode;
    private String sameTaxLocation;
    private String serviceAgentCode;
    private String salesChannelCode;
    private String insurerCode;
    private int currency;
    private String discountType;
    private List<Coverages> coverages;
    private PolicyHolder policyHolder;
    private List<Insureds> insureds;
    private List<Beneficiaries> beneficiaries;
    private List<Payers> payers;
    private List<PayerAccounts> payerAccounts;
    private List<String> trustees;
    private List<Customers> customers;
    private List<String> declarations;
    private List<String> agentDeclarations;
    public void setPolicyType(int policyType) {
         this.policyType = policyType;
     }
     public int getPolicyType() {
         return policyType;
     }

    public void setApplyDate(Date applyDate) {
         this.applyDate = applyDate;
     }
     public Date getApplyDate() {
         return applyDate;
     }

    public void setSubmissionDate(Date submissionDate) {
         this.submissionDate = submissionDate;
     }
     public Date getSubmissionDate() {
         return submissionDate;
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

    public void setSameTaxLocation(String sameTaxLocation) {
         this.sameTaxLocation = sameTaxLocation;
     }
     public String getSameTaxLocation() {
         return sameTaxLocation;
     }

    public void setServiceAgentCode(String serviceAgentCode) {
         this.serviceAgentCode = serviceAgentCode;
     }
     public String getServiceAgentCode() {
         return serviceAgentCode;
     }

    public void setSalesChannelCode(String salesChannelCode) {
         this.salesChannelCode = salesChannelCode;
     }
     public String getSalesChannelCode() {
         return salesChannelCode;
     }

    public void setInsurerCode(String insurerCode) {
         this.insurerCode = insurerCode;
     }
     public String getInsurerCode() {
         return insurerCode;
     }

    public void setCurrency(int currency) {
         this.currency = currency;
     }
     public int getCurrency() {
         return currency;
     }

    public void setDiscountType(String discountType) {
         this.discountType = discountType;
     }
     public String getDiscountType() {
         return discountType;
     }

    public void setCoverages(List<Coverages> coverages) {
         this.coverages = coverages;
     }
     public List<Coverages> getCoverages() {
         return coverages;
     }

    public void setPolicyHolder(PolicyHolder policyHolder) {
         this.policyHolder = policyHolder;
     }
     public PolicyHolder getPolicyHolder() {
         return policyHolder;
     }

    public void setInsureds(List<Insureds> insureds) {
         this.insureds = insureds;
     }
     public List<Insureds> getInsureds() {
         return insureds;
     }

    public void setBeneficiaries(List<Beneficiaries> beneficiaries) {
         this.beneficiaries = beneficiaries;
     }
     public List<Beneficiaries> getBeneficiaries() {
         return beneficiaries;
     }

    public void setPayers(List<Payers> payers) {
         this.payers = payers;
     }
     public List<Payers> getPayers() {
         return payers;
     }

    public void setPayerAccounts(List<PayerAccounts> payerAccounts) {
         this.payerAccounts = payerAccounts;
     }
     public List<PayerAccounts> getPayerAccounts() {
         return payerAccounts;
     }

    public void setTrustees(List<String> trustees) {
         this.trustees = trustees;
     }
     public List<String> getTrustees() {
         return trustees;
     }

    public void setCustomers(List<Customers> customers) {
         this.customers = customers;
     }
     public List<Customers> getCustomers() {
         return customers;
     }

    public void setDeclarations(List<String> declarations) {
         this.declarations = declarations;
     }
     public List<String> getDeclarations() {
         return declarations;
     }

    public void setAgentDeclarations(List<String> agentDeclarations) {
         this.agentDeclarations = agentDeclarations;
     }
     public List<String> getAgentDeclarations() {
         return agentDeclarations;
     }

}
