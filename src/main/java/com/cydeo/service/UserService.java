package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

    List<UserDTO> listAllUsers();//Service layer meaning controller will call the method/DTO
    UserDTO findByUserName(String username);//Update
    void save(UserDTO user);//Save
    void deleteByUserName(String username);//Delete
    UserDTO update(UserDTO user);
    void delete(String username);
    List<UserDTO> listAllByRole(String role);

}
