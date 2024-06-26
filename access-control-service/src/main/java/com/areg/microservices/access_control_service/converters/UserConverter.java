/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.converters;

import com.areg.microservices.access_control_service.models.dtos.UserDTO;
import com.areg.microservices.access_control_service.models.dtos.requests.user.UserSignUpRequest;
import com.areg.microservices.access_control_service.models.dtos.responses.user.UserSignupResponse;
import com.areg.microservices.access_control_service.models.entities.UserEntity;
import com.areg.microservices.access_control_service.utils.Utils;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserConverter {

    public UserSignupResponse fromEntityToSignUpResponse(UserEntity entity) {
        if (entity == null) {
            return null;
        }

        final var signupResponse = new UserSignupResponse();
        signupResponse.setUuid(entity.getUuid());
        signupResponse.setEmail(entity.getEmail());
        signupResponse.setFirstName(entity.getFirstName());
        signupResponse.setLastName(entity.getLastName());
        signupResponse.setStatus(entity.getStatus());
        return signupResponse;
    }

    public UserEntity fromRequestToEntity(UserSignUpRequest signUpDto) {
        if (signUpDto == null) {
            return null;
        }

        final var userEntity = new UserEntity();
        userEntity.setEmail(signUpDto.getEmail());
        userEntity.setFirstName(signUpDto.getFirstName());
        userEntity.setLastName(signUpDto.getLastName());
        return userEntity;
    }

    public Set<UserDTO> fromEntityToDto(Collection<UserEntity> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream().map(this::fromEntityToDto).collect(Collectors.toCollection(HashSet::new));
    }


    private UserDTO fromEntityToDto(UserEntity entity) {
        if (entity == null) {
            return null;
        }

        final var userDto = new UserDTO();
        userDto.setUuid(entity.getUuid());
        userDto.setEmail(entity.getEmail());
        userDto.setFirstName(entity.getFirstName());
        userDto.setLastName(entity.getLastName());
        userDto.setStatus(entity.getStatus());
        userDto.setCreationDate(Utils.epochSecondsToLocalDateTime(entity.getCreatedAt()));
        userDto.setUpdateDate(Utils.epochSecondsToLocalDateTime(entity.getUpdatedAt()));
        userDto.setLastLoginDate(Utils.epochSecondsToLocalDateTime(entity.getLastLoginAt()));
        return userDto;
    }
}