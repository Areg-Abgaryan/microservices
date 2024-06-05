/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.services.implementations;

import com.areg.microservices.access_control_service.services.interfaces.IRoleService;
import com.areg.microservices.access_control_service.models.entities.RoleEntity;
import com.areg.microservices.access_control_service.repositories.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RoleService implements IRoleService {

    private final IRoleRepository roleRepository;

    @Autowired
    public RoleService(IRoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Autowired
    public Collection<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }
}
