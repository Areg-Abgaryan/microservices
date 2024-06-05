/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.managers;

import com.areg.microservices.access_control_service.converters.RoleConverter;
import com.areg.microservices.access_control_service.models.dtos.RoleDTO;
import com.areg.microservices.access_control_service.services.implementations.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleManager {

    private final RoleService roleService;
    private final RoleConverter roleConverter;

    @Autowired
    public RoleManager(RoleService roleService, RoleConverter roleConverter) {
        this.roleService = roleService;
        this.roleConverter = roleConverter;
    }


    public Set<RoleDTO> getAllRoles() {
        return roleConverter.fromEntityToDto(roleService.getAllRoles());
    }
}
