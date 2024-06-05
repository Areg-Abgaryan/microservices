/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.exceptions;

public class BlankInputDataException extends RuntimeException {

    public BlankInputDataException() {
        super("Input arguments cannot be blank");
    }
}
