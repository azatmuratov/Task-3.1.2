package ru.itmentor.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itmentor.spring.boot_security.demo.models.Role;
import ru.itmentor.spring.boot_security.demo.repositories.RoleRepository;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) { this.roleRepository = roleRepository; }

    @Override
    public void add(Role role) { this.roleRepository.save(role); }

    @Override
    public void remove(long id) { this.roleRepository.deleteById(id); }

    @Override
    public void update(Role role) { this.roleRepository.save(role); }

    @Override
    public Role getById(long id) { return this.roleRepository.findById(id); }

    @Override
    public List<Role> listRoles() {return this.roleRepository.findAll(); }
}
