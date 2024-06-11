/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.notifications_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Notifications Application
 *
 * @since 2024
 * @version 1.0
 * @author Areg Abgaryan
 */

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = "com.areg.microservices.notifications_service")
@OpenAPIDefinition(
        info = @Info(title = "Notifications Microservice", version = "1.0.0",
                contact = @Contact(name = "Areg Abgaryan", email = "abgaryan.areg@gmail.com", url = "https://www.linkedin.com/in/abgaryan-areg/")))
public class NotificationsApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationsApplication.class, args);
    }
}