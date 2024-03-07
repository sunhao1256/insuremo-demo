package com.ebao.cloud.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@FeignClient(name = "emailclient", url = "${insuremo_gw_url}", path = "/eBao/1.0")
public interface EmailClient {

    @PostMapping(value = "/email/send")
    Map sendMail(@RequestBody Map requestBody);
}

