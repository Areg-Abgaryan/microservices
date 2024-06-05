/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.models.dtos.responses.user;

import com.areg.microservices.access_control_service.models.enums.UserStatus;
import com.areg.microservices.access_control_service.managers.EmailVerificationManager;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSignupResponse {

    @JsonProperty("uuid")
    @NotBlank private UUID uuid;

    @JsonProperty("email")
    @NotBlank @Email private String email;

    @JsonProperty("first_name")
    @NotBlank private String firstName;

    @JsonProperty("last_name")
    @NotBlank private String lastName;

    @JsonProperty("status")
    @NotBlank private UserStatus status;

    @JsonProperty("otp_verification_instructions")
    @NotBlank private String otpVerificationInstructions;

    public void setOtpVerificationInstructions(String email) {
        otpVerificationInstructions = EmailVerificationManager.createOTPInstructionsMessage(email);
    }
}