package com.ebao.cloud.service;


import com.ebao.cloud.domain.TMailHistoryEntity;
import com.ebao.cloud.integration.EmailClient;
import com.ebao.cloud.repository.MailHistoryRepository;
import com.insuremo.appframework.config.Env;
import com.insuremo.sdk.container.email.api.EmailApi;
import com.insuremo.sdk.container.email.bundle.SendEmailRequestBundle;
import com.insuremo.sdk.container.email.bundle.SendEmailResponseBundle;
import com.insuremo.sdk.container.email.model.ModelEmailInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmailService {
    private Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    EmailApi emailClient;

    @Autowired
    MailHistoryRepository mailHistoryRepository;

    public void sendIssuedMail(Map policyInfo) {

        logger.info("Preparing  to send mail");

        List<Map> policyCustomerList = (List<Map>) policyInfo.get("PolicyCustomerList");
        Object consigneeMail = policyCustomerList.get(0).get("Email");
        logger.info("consigneeMail:{}", consigneeMail);
        if (consigneeMail == null) {
            return;
        }

        //pre define
        String subject = "eBaoTech Policy Number {0}";
        String templateCode = "IssuePolicy";

        List<String> consigneeList = Arrays.asList(String.valueOf(consigneeMail));

        String account = Env.getParameter("ebao.email.account","insuremo-sandbox2@insuremo.com");
        Map map = new HashMap<>();
        map.put("subject", MessageFormat.format(subject, policyInfo.get("PolicyNo")));
        map.put("templateCode", templateCode);
        map.put("templateParams", policyInfo);
        map.put("account", account);
        map.put("consignee", consigneeList);

        logger.info("Sending mail. data:{}", map);
        ModelEmailInfo modelEmailInfo = new ModelEmailInfo()
                .subject(MessageFormat.format(subject, policyInfo.get("PolicyNo")))
                .templateCode(templateCode)
                .templateParams(policyInfo)
                .account(account)
                .consignee(consigneeList);
        SendEmailResponseBundle responseBundle = emailClient.sendEmail(new SendEmailRequestBundle().emailInfo(modelEmailInfo));
        logger.info("Sent mail result,{}", responseBundle.getBody());
        logMailRecord(map);

    }

    protected void logMailRecord(Map mailMap) {
        TMailHistoryEntity mailHistoryEntity = new TMailHistoryEntity();
        mailHistoryEntity.setAccount(mailMap.get("account").toString());
        mailHistoryEntity.setConsignee(mailMap.get("consignee").toString());
        mailHistoryEntity.setSubject(mailMap.get("subject").toString());
        mailHistoryEntity.setTemplateCode(mailMap.get("templateCode").toString());
        mailHistoryRepository.save(mailHistoryEntity);
    }

}