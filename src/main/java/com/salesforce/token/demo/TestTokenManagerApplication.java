package com.salesforce.token.demo;

import com.tgt.crm.token.webflux.SalesforceLibraryAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SalesforceLibraryAutoConfiguration.class)
public class TestTokenManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTokenManagerApplication.class, args);
	}

}
