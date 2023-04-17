package com.userservice.userservice.service;

import com.userservice.userservice.dto.UserDto;
import com.userservice.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}
