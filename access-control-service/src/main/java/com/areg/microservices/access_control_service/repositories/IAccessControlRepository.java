/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.repositories;

import com.areg.microservices.access_control_service.models.entities.AccessControlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IAccessControlRepository extends JpaRepository<AccessControlEntity, Long> {

    Set<AccessControlEntity> findByUserGroupIdIn(Set<Long> userGroupIds);
}