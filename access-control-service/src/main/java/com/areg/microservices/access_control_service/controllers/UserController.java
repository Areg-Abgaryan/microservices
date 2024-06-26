/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.controllers;

import com.areg.microservices.access_control_service.managers.UserManager;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user-controller")
@RequestMapping(EndpointsConstants.USER)
@Tag(name = "User Controller")
public class UserController {

    private final UserManager userManager;

    @Autowired
    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }


    @Operation(summary = "Get all active users", description = "Get all active users in the system")
    @GetMapping(EndpointsConstants.GET_ALL)
    public ResponseEntity<?> getAllActiveUsers() {
        //  FIXME !! Add jwt token auth check here also
        try {
            return ResponseEntity.ok(userManager.getAllActiveUsers());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }
}
