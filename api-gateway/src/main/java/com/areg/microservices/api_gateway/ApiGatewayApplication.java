/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.api_gateway;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Api Gateway Application
 *
 * @since 2024
 * @version 1.0
 * @author Areg Abgaryan
 */

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
        info = @Info(title = "Api Gateway Microservice", version = "1.0.0",
                contact = @Contact(name = "Areg Abgaryan", email = "abgaryan.areg@gmail.com", url = "https://www.linkedin.com/in/abgaryan-areg/")))
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
