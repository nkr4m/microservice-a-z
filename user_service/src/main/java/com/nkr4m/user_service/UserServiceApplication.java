package com.nkr4m.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "User service microservice REST API Documentation",
				description = "User service REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ramachandran NK",
						email = "abc@abc.com",
						url = "abc@abc.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "abc@abc.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "User service REST API Documentation",
				url = "https://www.eazybytes.com/swagger-ui.html"
		)
)
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
