package com.salesforce.token.demo.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SalesforceClient {


    private final WebClient salesforceWebClient;

    public SalesforceClient(@Qualifier("sfWebClient") final WebClient salesforceWebClient) {
        this.salesforceWebClient = salesforceWebClient;
    }

    public Mono<String> querySalesforce() {
        return salesforceWebClient
                .get()
                .uri("/services/data/v50.0/query&q={query}", "SELECT Id FROM Case")
                .retrieve()
                .toEntity(String.class)
                .map(HttpEntity::getBody);
    }
}