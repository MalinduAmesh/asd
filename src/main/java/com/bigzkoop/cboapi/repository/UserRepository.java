package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String name);
}
