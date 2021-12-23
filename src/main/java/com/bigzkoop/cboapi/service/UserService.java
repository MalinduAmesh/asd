package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.entity.Role;
import com.bigzkoop.cboapi.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName,String roleName);
    User getUser(String userName);
    List<User>getUsers();
}
