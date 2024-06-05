/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.exceptions;

public class SessionExpiredException extends RuntimeException {

    public SessionExpiredException(String message) {
        super("Session expired ! " + message);
    }
}
