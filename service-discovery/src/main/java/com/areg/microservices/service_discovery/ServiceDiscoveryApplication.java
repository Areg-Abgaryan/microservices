/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.service_discovery;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Service Discovery Application
 *
 * @since 2024
 * @version 1.0
 * @author Areg Abgaryan
 */

@SpringBootApplication
@EnableEurekaServer
@EntityScan(basePackages = "com.areg.microservices.service_discovery")
@OpenAPIDefinition(
        info = @Info(title = "Service Discovery Microservice", version = "1.0.0",
                contact = @Contact(name = "Areg Abgaryan", email = "abgaryan.areg@gmail.com", url = "https://www.linkedin.com/in/abgaryan-areg/")))
public class ServiceDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryApplication.class, args);
    }
}
