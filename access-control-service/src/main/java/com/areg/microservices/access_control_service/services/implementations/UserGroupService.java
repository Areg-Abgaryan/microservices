/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.services.implementations;

import com.areg.microservices.access_control_service.models.entities.UserGroupEntity;
import com.areg.microservices.access_control_service.repositories.IUserGroupRepository;
import com.areg.microservices.access_control_service.services.interfaces.IUserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserGroupService implements IUserGroupService {

    private final IUserGroupRepository userGroupRepository;

    @Autowired
    public UserGroupService(IUserGroupRepository userGroupRepository) {
        this.userGroupRepository = userGroupRepository;
    }


    @Override
    public Collection<UserGroupEntity> getAllUserGroups() {
        return userGroupRepository.findAll();
    }
}
