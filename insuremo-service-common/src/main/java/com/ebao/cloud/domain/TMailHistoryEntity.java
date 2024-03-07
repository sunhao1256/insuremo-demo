package com.ebao.cloud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_mail_history")
public class TMailHistoryEntity extends BaseEntity {

    @Column(name = "account")
    private String account;

    @Column(name = "consignee")
    private String consignee;

    @Column(name = "subject")
    private String subject;

    @Column(name = "templateCode")
    private String templateCode;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}