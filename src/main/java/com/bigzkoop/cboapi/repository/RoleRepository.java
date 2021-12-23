package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);

}
