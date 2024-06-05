/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.services.implementations;

import com.areg.microservices.access_control_service.exceptions.AccessControlNotFoundException;
import com.areg.microservices.access_control_service.services.interfaces.IAccessControlService;
import com.areg.microservices.access_control_service.models.entities.AccessControlEntity;
import com.areg.microservices.access_control_service.repositories.IAccessControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AccessControlService implements IAccessControlService {

    private final IAccessControlRepository accessControlRepository;

    @Autowired
    public AccessControlService(IAccessControlRepository accessControlRepository) {
        this.accessControlRepository = accessControlRepository;
    }

    @Override
    public Set<AccessControlEntity> getByUserGroupIds(Set<Long> userGroupIds) {
        final Set<AccessControlEntity> accessControls = accessControlRepository.findByUserGroupIdIn(userGroupIds);
        if (accessControls.isEmpty()) {
            throw new AccessControlNotFoundException(userGroupIds);
        }

        return accessControls;
    }
}
