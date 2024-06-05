/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.converters;

import com.areg.microservices.access_control_service.models.dtos.responses.user.RefreshTokenCreateResponse;
import com.areg.microservices.access_control_service.models.entities.RefreshTokenEntity;
import com.areg.microservices.access_control_service.security.tokens.RefreshToken;
import com.areg.microservices.access_control_service.utils.Utils;
import org.springframework.stereotype.Component;

@Component
public class RefreshTokenConverter {

    public RefreshTokenCreateResponse fromEntityToCreateResponse(RefreshTokenEntity entity) {
        if (entity == null) {
            return null;
        }

        final var refreshTokenResponse = new RefreshTokenCreateResponse();
        refreshTokenResponse.setToken(entity.getToken());
        refreshTokenResponse.setUuid(entity.getUuid());
        return refreshTokenResponse;
    }

    public RefreshToken fromEntityToToken(RefreshTokenEntity refreshTokenEntity) {
        if (refreshTokenEntity == null) {
            return null;
        }

        final var refreshToken = new RefreshToken();
        refreshToken.setToken(refreshTokenEntity.getToken());
        refreshToken.setUuid(refreshTokenEntity.getUuid());
        refreshToken.setUserUuid(refreshTokenEntity.getUserEntity().getUuid());
        refreshToken.setExpiringAt(Utils.epochSecondsToLocalDateTime(refreshTokenEntity.getExpiringAt()));
        return refreshToken;
    }
}
