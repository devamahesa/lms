package com.deva.lms.service;

import com.deva.lms.dto.UserDto;
import com.deva.lms.entity.User;

import java.util.List;
public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
