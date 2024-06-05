/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.services.interfaces;

import com.areg.microservices.access_control_service.models.entities.RefreshTokenEntity;

import java.util.UUID;

public interface IRefreshTokenService {

    RefreshTokenEntity createRefreshToken(UUID userUuid);

    RefreshTokenEntity updateRefreshToken(UUID userUuid);

    RefreshTokenEntity getByUserId(Long userId);
}
