package com.salesforce.token.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    private final SalesforceClient salesforceClient;

    public TestController(SalesforceClient salesforceClient) {
        this.salesforceClient = salesforceClient;
    }

    @GetMapping(value = "/test")
    public String test() {
        return salesforceClient
                .querySalesforce()
                .block();
    }
}
