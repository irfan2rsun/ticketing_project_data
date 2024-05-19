package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {

        //Controller called me and requesting all RoleDTOs, so it can show in the drop-down in the UI
        //I need to make a call to DB and get all the roles from table
        //Go to repository and find a service(method) which gives me the roles from DB(Business Logic)
        //How am I able to call any service here? I need to inject it.

        List<Role> roleList = roleRepository.findAll();

        //I have Role entities from DB
        //I need to convert those Role entities to DTOs
        //I need to use ModelMapper
        //I already created a class called RoleMapper and there are two methods for me to make this conversion happen
        //I inject it, so I can use the method to convert a bunch of roles entities to DTO to show on the UI thorough stream

        return roleList.stream()
                .map(roleMapper::convertToDto)
                .collect(Collectors.toList());//if I am calling a method directly from a class I can use "::"




    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
