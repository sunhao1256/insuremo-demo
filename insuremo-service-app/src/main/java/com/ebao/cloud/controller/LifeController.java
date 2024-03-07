package com.ebao.cloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebao.cloud.integration.LifeClient;
import com.ebao.cloud.life.dto.proposal.ProposalRequest;
import com.ebao.cloud.life.dto.proposal.ProposalResponse;
import com.ebao.cloud.life.dto.proposal.input.Customers;
import com.ebao.cloud.life.dto.quotation.QuotationRequest;
import com.ebao.cloud.life.dto.quotation.QuotationResponse;
import com.ebao.cloud.service.EmailService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/life")
@Tag(name = "Life BFF")
public class LifeController {

  private Logger logger = LoggerFactory.getLogger(LifeController.class);

  @Autowired
  private LifeClient lifeClient;

  @Autowired
  private EmailService emailService;

  @PostMapping(value = {"/quotation"})
  @Operation(summary = "life product quotation")
  public QuotationResponse quotaion(@RequestHeader("X-mo-tenant-id") String tenantCode,
      @RequestHeader(HttpHeaders.AUTHORIZATION) String auth, @RequestBody QuotationRequest request,
      HttpServletRequest req, HttpServletResponse res) {
    logger.info("header={}", tenantCode);
    logger.info("quotation request :{}", request);
    QuotationResponse response = lifeClient.quotation(tenantCode, request);
    logger.info("Quotation response :{}", response);
    return response;
  }

  @PostMapping(value = {"/proposal"})
  @Operation(summary = "life product proposal")
  public ProposalResponse proposal(@RequestHeader("X-mo-tenant-id") String tenantCode,
      @RequestHeader(HttpHeaders.AUTHORIZATION) String auth, @RequestBody ProposalRequest request,
      HttpServletRequest req, HttpServletResponse res) {
    logger.info("proposal request :{}", request);
    ProposalResponse response = lifeClient.proposals(tenantCode, request);
    logger.info("proposal response :{}", response);
    if (response.getResult() == 1) {
      Map policyInfo = new HashMap<>();
      policyInfo.put("PolicyNo", response.getPolicy().getPolicyNumber());

      Optional<Customers> findFirst = request.getPolicy().getCustomers().stream()
          .filter(
              c -> c.getPartySerialId() == request.getPolicy().getPolicyHolder().getPartySerialId())
          .findFirst();
      if (findFirst.isPresent()
          && StringUtils.isNotBlank(findFirst.get().getPartyContact().getEmail())) {
        List<Map> policyCustomerList = new ArrayList<>();
        Map cusMap = new HashMap<>();
        cusMap.put("Email", findFirst.get().getPartyContact().getEmail());
        policyCustomerList.add(cusMap);
        policyInfo.put("PolicyCustomerList", policyCustomerList);

        emailService.sendIssuedMail(policyInfo);
      }
    }
    return response;
  }

}
