package com.deva.lms.service.impl;
import com.deva.lms.dto.UserDto;
import com.deva.lms.entity.Role;
import com.deva.lms.entity.User;
import com.deva.lms.repository.RoleRepository;
import com.deva.lms.repository.UserRepository;
import com.deva.lms.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(UserDto userDto) {

    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public List<UserDto> findAllUsers() {
        return null;
    }
}
