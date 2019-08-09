package com.example.demo.service;

import com.example.demo.dto.User;

public interface UserService {
    User selectUserById(Integer userId);
}
