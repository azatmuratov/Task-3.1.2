package ru.itmentor.spring.boot_security.demo.services;

import ru.itmentor.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {
    void add(Role role);
    void remove(long id);
    void update(Role role);
    Role getById(long id);
    List<Role> listRoles();
}
