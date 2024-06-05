/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.services.interfaces;

import com.areg.microservices.access_control_service.models.entities.UserEntity;

import java.util.List;
import java.util.UUID;

public interface IUserService {

    UserEntity createUnverifiedUser(UserEntity userEntity);

    UserEntity saveVerifiedUser(UserEntity userEntity);

    void removeOtpData(UserEntity userEntity);

    void updateLastLoginDate(String email, long lastLoginDate);

    void updateUser(UserEntity entity);

    List<UserEntity> getAllActiveUsers();

    UserEntity getActiveUserByEmail(String email);

    UserEntity getActiveUserByUuid(UUID uuid);

    UserEntity getUserByEmail(String email);
}
