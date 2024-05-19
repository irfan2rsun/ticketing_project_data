package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();//Service layer meaning controller will call the method/DTO
    UserDTO findByUserName(String username);//Update
    void save(UserDTO user);//Save
    void deleteByUserName(String username);//Delete

}
