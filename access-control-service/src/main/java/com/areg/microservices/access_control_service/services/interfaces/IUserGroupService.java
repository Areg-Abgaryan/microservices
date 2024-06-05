/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.services.interfaces;

import com.areg.microservices.access_control_service.models.entities.UserGroupEntity;

import java.util.Collection;

public interface IUserGroupService {

    Collection<UserGroupEntity> getAllUserGroups();
}
