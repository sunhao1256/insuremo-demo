/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.quotation.input;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2023-03-15 16:41:56
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Policy {

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date applyDate;
    private int currency;
    private String quotationCode;
    private String serviceAgentCode;
    private String salesChannelCode;
    private String insurerCode;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date inceptionDate;
    private List<Customers> customers;
    private List<Coverages> coverages;
    private PolicyHolder policyHolder;
    private List<Insureds> insureds;
    private List<PayerAccounts> payerAccounts;
    public void setApplyDate(Date applyDate) {
         this.applyDate = applyDate;
     }
     public Date getApplyDate() {
         return applyDate;
     }

    public void setCurrency(int currency) {
         this.currency = currency;
     }
     public int getCurrency() {
         return currency;
     }

    public void setQuotationCode(String quotationCode) {
         this.quotationCode = quotationCode;
     }
     public String getQuotationCode() {
         return quotationCode;
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

    public void setInceptionDate(Date inceptionDate) {
         this.inceptionDate = inceptionDate;
     }
     public Date getInceptionDate() {
         return inceptionDate;
     }

    public void setCustomers(List<Customers> customers) {
         this.customers = customers;
     }
     public List<Customers> getCustomers() {
         return customers;
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

    public void setPayerAccounts(List<PayerAccounts> payerAccounts) {
         this.payerAccounts = payerAccounts;
     }
     public List<PayerAccounts> getPayerAccounts() {
         return payerAccounts;
     }

}
