package com.example.userservice.service;

/**
 * @author Vithum vindeepa
 */
public interface UserService {
    String newUser(UserDTO userDTO);
    void deleteUser(String id);
    UserDTO getUser(String id);
    String updateUser(UserDTO userDTO);
    boolean isUserExist(String id);
}
