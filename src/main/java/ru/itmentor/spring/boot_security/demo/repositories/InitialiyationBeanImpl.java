package ru.itmentor.spring.boot_security.demo.repositories;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itmentor.spring.boot_security.demo.models.Role;
import ru.itmentor.spring.boot_security.demo.models.User;
import ru.itmentor.spring.boot_security.demo.services.RoleService;
import ru.itmentor.spring.boot_security.demo.services.UserService;

@Component
public class InitialiyationBeanImpl implements InitializingBean {
    private UserService userService;
    private RoleService roleService;

    @Autowired
    public InitialiyationBeanImpl(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Role roleAdmin = new Role(1, "ROLE_ADMIN");
        roleService.add(roleAdmin);
        User admin = new User("admin", "admin", "Admin", "Admin", "6000000006", roleAdmin);
        userService.add(admin);
    }
}
