package com.itheima.mapper;

import com.itheima.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}