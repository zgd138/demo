package com.example.demo.dao;

import com.example.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  UserDao {
    public User selectUserById(Integer userId);
}
