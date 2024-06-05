/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.validators;

import com.areg.microservices.access_control_service.exceptions.BlankInputDataException;
import com.areg.microservices.access_control_service.managers.EmailVerificationManager;
import com.areg.microservices.access_control_service.models.dtos.requests.user.UserLoginRequest;
import com.areg.microservices.access_control_service.models.dtos.requests.user.UserSignUpRequest;
import com.areg.microservices.access_control_service.models.dtos.requests.user.UserVerifyEmailRequest;
import jakarta.mail.internet.AddressException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInputValidator {

    private final InputPatternValidator inputPatternValidator;
    private final EmailVerificationManager emailVerificationManager;

    @Autowired
    public UserInputValidator(InputPatternValidator inputPatternValidator, EmailVerificationManager emailVerificationManager) {
        this.inputPatternValidator = inputPatternValidator;
        this.emailVerificationManager = emailVerificationManager;
    }

    //  Check whether the user input is valid or not
    public void validateUserInput(UserSignUpRequest signUpDto) throws AddressException {
        if (StringUtils.isAnyBlank(signUpDto.getEmail(), signUpDto.getPassword(), signUpDto.getFirstName(),
                signUpDto.getLastName())) {
            throw new BlankInputDataException();
        }
        emailVerificationManager.isValidEmailAddress(signUpDto.getEmail());
        inputPatternValidator.validatePassword(signUpDto.getPassword());
        inputPatternValidator.validateFirstName(signUpDto.getFirstName());
        inputPatternValidator.validateLastName(signUpDto.getLastName());
    }

    public void validateUserInput(UserVerifyEmailRequest verifyEmailDto) throws AddressException {
        if (StringUtils.isAnyBlank(verifyEmailDto.getEmail(), verifyEmailDto.getPassword())) {
            throw new BlankInputDataException();
        }
        emailVerificationManager.isValidEmailAddress(verifyEmailDto.getEmail());
        inputPatternValidator.validatePassword(verifyEmailDto.getPassword());
    }

    public void validateUserInput(UserLoginRequest loginDto) throws AddressException {
        if (StringUtils.isAnyBlank(loginDto.getEmail(), loginDto.getPassword())) {
            throw new BlankInputDataException();
        }
        emailVerificationManager.isValidEmailAddress(loginDto.getEmail());
        inputPatternValidator.validatePassword(loginDto.getPassword());
    }
}
