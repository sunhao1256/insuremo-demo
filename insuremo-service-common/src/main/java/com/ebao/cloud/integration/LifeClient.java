package com.ebao.cloud.integration;

import com.ebao.cloud.life.dto.proposal.ProposalRequest;
import com.ebao.cloud.life.dto.proposal.ProposalResponse;
import com.ebao.cloud.life.dto.quotation.QuotationRequest;
import com.ebao.cloud.life.dto.quotation.QuotationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "life-client", url = "${insuremo_gw_url}",
    path = "/ebaoli/1.0/limobs")
public interface LifeClient {

    @PostMapping(value = "/proposals/quotation")
    QuotationResponse quotation(@RequestHeader("X-mo-tenant-id") String tenantCode,
        @RequestBody QuotationRequest request);

    @PostMapping(value = "/proposals")
    ProposalResponse proposals(@RequestHeader("X-mo-tenant-id") String tenantCode,
        @RequestBody ProposalRequest requestBody);


}

