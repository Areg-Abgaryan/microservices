/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.managers;

import com.areg.microservices.access_control_service.converters.UserGroupConverter;
import com.areg.microservices.access_control_service.models.dtos.UserGroupDTO;
import com.areg.microservices.access_control_service.services.implementations.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserGroupManager {

    private final UserGroupService userGroupService;
    private final UserGroupConverter userGroupConverter;

    @Autowired
    public UserGroupManager(UserGroupService userGroupService, UserGroupConverter userGroupConverter) {
        this.userGroupService = userGroupService;
        this.userGroupConverter = userGroupConverter;
    }


    public Set<UserGroupDTO> getAllUserGroups() {
        return userGroupConverter.fromEntityToDto(userGroupService.getAllUserGroups());
    }
}
