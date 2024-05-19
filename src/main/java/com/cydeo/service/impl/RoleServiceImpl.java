package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleDTO> listAllRoles() {

        //Controller called me and requesting all RoleDTOs, so it can show in the drop-down in the UI
        //I need to make a call to DB and get all the roles from table
        //Go to repository and find a service(method) which gives me the roles from DB(Business Logic)
        //How am I able to call any service here? I need to inject it.

        List<Role> roleList = roleRepository.findAll();

        return roleList;
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
