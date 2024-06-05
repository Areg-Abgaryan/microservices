/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.repositories;

import com.areg.microservices.access_control_service.models.entities.UserGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserGroupRepository extends JpaRepository<UserGroupEntity, Long> {
}
