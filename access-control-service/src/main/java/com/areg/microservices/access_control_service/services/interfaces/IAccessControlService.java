/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.services.interfaces;

import com.areg.microservices.access_control_service.models.entities.AccessControlEntity;

import java.util.Set;

public interface IAccessControlService {

    Set<AccessControlEntity> getByUserGroupIds(Set<Long> userGroupIds);
}
