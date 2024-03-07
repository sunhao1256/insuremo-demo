package com.ebao.cloud.controller;

import com.ebao.cloud.domain.TMailHistoryEntity;
import com.ebao.cloud.repository.MailHistoryRepository;
import com.insuremo.appframework.context.AppContext;
import com.insuremo.sdk.gimo.proposal.api.ProposalApi;
import com.insuremo.sdk.gimo.proposal.bundle.CreateRequestBundle;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.commons.collections4.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value = "/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

//    @Autowired
//    private DataTableManagementRestfulService dataTableManagementRestfulService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    private GlobalTransactionService globalTransactionService;

    @Autowired
    private MailHistoryRepository mailHistoryRepository;

    @Autowired
    private ProposalApi proposalRestful;

    @Autowired
    @Qualifier("restTemplateWithLoadBalance")
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/testbff")
    @Operation(summary = "test bff")
    public String testBff() {
        logger.info("testbff ok");
        return "success";
    }

    @GetMapping("/testGIMO")
    public String testGIMO() {
//        BusinessDataTable businessDataTable = dataTableManagementRestfulService.findDataTableByDataTableName("Branch");
//        logger.info("testGIMO ok");
//        if (businessDataTable != null && businessDataTable.getDataTableId() != null) {
//            return "success";
//        }

        return "fail";
    }

    @GetMapping("/testDB")
    @Operation(summary = "test DB")
    public String testDB() {
        List<Map<String, Object>> result = jdbcTemplate.queryForList("select  1 from information_schema.TABLES");
        return "success";
    }

    @GetMapping("/helloJack")
    public String helloJack() {
        logger.info("hello world，jack");
        return "hello world，jack";
    }

    @GetMapping("/testCallService/help")
    public Map testCallServiceGet() {
        Map<String, String> help = new HashMap<>();
        help.put("title", "Submit url to test calling it from BFF");
        help.put("service", "http://{service-name}/uri");
        help.put("k8s", "http://{service-name}.{namespace}/uri");
        help.put("External", "http(s)://hostname/uri");
        return help;
    }

    @GetMapping("/testCallService/url")
    public String testCallServicePost(@RequestParam("url") String url, @RequestParam(value = "external", defaultValue = "false") boolean isExternal) {
        return callRestService(url, isExternal);
    }

    @GetMapping("/testCallService/self")
    public String testCallService1() {
        return callRestService("http://" + appName + "/test/testbff", false);
    }

    @GetMapping("/testCallService/k8s")
    public String testCallService2() {
        return callRestService("http://" + appName + "." + AppContext.getTenantCode() + "/test/testbff", false);
    }

    @GetMapping("/testCallService/public")
    public String testCallService3() {
        return callRestService("https://api.ipify.org?format=json", true);
    }

    /**
     * Call service using the restTemplate
     *
     * @param url Service in the same k8s cluster & namespace:   http://{service-name}/path
     *            Service in the same k8s cluster: 	             http://{service-name}.{namespace}/path
     *            External Service:                              http(s)://hostname/path
     * @return
     */
    public String callRestService(String url, boolean isExternal) {
        try {
            RestTemplate theRestTemplate = restTemplate;
            if (isExternal) {
                theRestTemplate = new RestTemplate();
            }
            logger.info("Start calling rest service at " + url);
            ResponseEntity<String> response = theRestTemplate.getForEntity(url, String.class);
            logger.info("OK");
            logger.info(response.getBody());
            return response.getBody();
        } catch (RestClientException e) {
            logger.error("Failed", e);
            return "Failed to call rest service at " + url;
        }
    }


    /**
     * @param policyInfo
     * @param isRollback Y.rollback   N.non rollback
     * @return
     */
    @PostMapping("/seataRollback")
    public Map testSeataRollBack(@RequestBody Map policyInfo, @RequestParam(value = "isRollback", defaultValue = "Y", required = false) String isRollback) {
        logger.info("entry testSeataRollBack method ");
//        globalTransactionService.beginGlobalTransaction(AppContext.getTenantCode() + "-ext-bff-seata");

        //insert
        logger.info("prepare insert mail history ");
        TMailHistoryEntity mailHistoryEntity = new TMailHistoryEntity();
        mailHistoryEntity.setAccount("testSeata.ebaotech.com");
        mailHistoryEntity.setConsignee("testSeata");
        mailHistoryEntity.setSubject("testSeata");

        mailHistoryEntity = mailHistoryRepository.save(mailHistoryEntity);
        logger.info("complete insert mail history, id:{}", mailHistoryEntity.getId());


        //create  proposal
        logger.info("prepare create proposal ");
        policyInfo = proposalRestful.create(new CreateRequestBundle().policyInfo(policyInfo)).getBody();
        logger.info("complete create proposal,PolicyId:{}", MapUtils.getLong(policyInfo, "PolicyId"));

        logger.info("Is rollback? isRollback：{},", isRollback);
        if ("Y".equals(isRollback)) {
            throw new RuntimeException("Test Seata  Rollback");
        }
        logger.info("execute this method success");

        return policyInfo;
    }

}
