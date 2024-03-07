package com.ebao.cloud.controller;

import com.ebao.cloud.error.ErrorConstants;
import com.ebao.cloud.service.EmailService;
import com.insuremo.appframework.exception.SystemError;
import com.insuremo.sdk.gimo.proposal.api.ProposalApi;
import com.insuremo.sdk.gimo.proposal.bundle.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/proposal")
@Tag(name = "Proposal BFF")
public class ProposalController {

    private Logger logger = LoggerFactory.getLogger(ProposalController.class);

//    @Autowired
//    private GlobalTransactionService globalTransactionService;

    @Autowired
    private ProposalApi proposalRestful;

    @Autowired
    private EmailService emailService;

    @RequestMapping(
            value = {"/v1/save"},
            method = {RequestMethod.POST}
    )
    @Operation(summary = "save Proposal")
    public Map proposalSave(@RequestBody Map policyInfo) {
        // for reference purpose
        // if (checkProposalCount(policyInfo)) {
        //    throw new BusinessException(ErrorConstants.PROPOSAL_CREATION_RULE_10001, 5);
        // }

//        globalTransactionService.beginGlobalTransaction(AppContext.getTenantCode() + "-ext-bff-proposalSave");
        logger.info("Saving Proposal.  data:{}", policyInfo);
        policyInfo = proposalRestful.create(new CreateRequestBundle().policyInfo(policyInfo)).getBody();
        logger.info("Saved Proposal.  data:{}", policyInfo);
        return policyInfo;
    }

    @RequestMapping(
            value = {"/v1/calculate"},
            method = {RequestMethod.POST}
    )
    @Operation(summary = "validate and calculate Proposal")
    public Map calculate(@RequestBody Map policyInfo) {
//        globalTransactionService.beginGlobalTransaction(AppContext.getTenantCode() + "-ext-bff-proposalCalculate");
        logger.info("Validating Proposal.  data:{}", policyInfo);
        proposalRestful.validate(new ValidateRequestBundle().policyInfo(policyInfo));
        logger.info("Calculating Proposal.  data:{}", policyInfo);
        policyInfo = proposalRestful.calculate(new CalculateRequestBundle().policyInfo(policyInfo)).getBody();
        logger.info("Calculated Proposal.  data:{}", policyInfo);
        return policyInfo;
    }

    @RequestMapping(
            value = {"/v1/proposalConfirm"},
            method = {RequestMethod.POST}
    )
    @Operation(summary = "validate,calculate and save Proposal")
    public Map proposalConfirm(@RequestBody Map policyInfo) {
//        globalTransactionService.beginGlobalTransaction(AppContext.getTenantCode() + "-ext-bff-proposalConfirm");
        logger.info("Validating Proposal.  data:{}", policyInfo);
        proposalRestful.validate(new ValidateRequestBundle().policyInfo(policyInfo));
        if (policyInfo.get("PolicyId") == null) {
            logger.info("Saving Proposal.  data:{}", policyInfo);
            policyInfo = proposalRestful.create(new CreateRequestBundle().policyInfo(policyInfo)).getBody();
        }
        logger.info("Calculating Proposal.  data:{}", policyInfo);
        policyInfo = proposalRestful.persistCalculate(new PersistCalculateRequestBundle().policyInfo(policyInfo)).getBody();
        logger.info("Calculated Proposal.  data:{}", policyInfo);
        return policyInfo;
    }

    @RequestMapping(
            value = {"/v1/issue"},
            method = {RequestMethod.POST}
    )
    @Operation(summary = "issue policy and send mail")
    public Map issue(@RequestBody Map policyInfo) {
        String proposalNo = (String) policyInfo.get("ProposalNo");
        if (StringUtils.isEmpty(proposalNo)) {
            throw new SystemError(ErrorConstants.MISSING_PARAMETER, "ProposalNo is missing");
        }

//        globalTransactionService.beginGlobalTransaction(AppContext.getTenantCode() + "-ext-bff-issue");
        logger.info("Issuing Proposal.  data:{}", policyInfo);
        policyInfo = proposalRestful.issuePolicy(new IssuePolicyRequestBundle().policyInfo(policyInfo)).getBody();
        emailService.sendIssuedMail(policyInfo);

        return policyInfo;
    }

}
