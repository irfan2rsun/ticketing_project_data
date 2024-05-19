package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleService {

    List<RoleDTO> listAllRoles();

    RoleDTO findById(Long id);  //We are still writing the Service and nothing is about entity here just yet
}
