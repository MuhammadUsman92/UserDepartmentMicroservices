package com.muhammadusman92.userservice.services;

import com.muhammadusman92.userservice.dto.ResponseDto;
import com.muhammadusman92.userservice.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserById(Long userId);

    ResponseDto getUserWithDepartment(Long userId);
}
