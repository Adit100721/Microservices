package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountContactInfoDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value={AccountContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
title = "Eazy Bank Accounts API",
description = "Eazy Bank Accounts API REST API DOCUMENTATION",
version = "1.0",
contact = @Contact(
		name = "Aditya",
		email = "adi8169909565@gmail.com"
		),
				license =@License(
						name = "Apache 2.0"
				)

		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
