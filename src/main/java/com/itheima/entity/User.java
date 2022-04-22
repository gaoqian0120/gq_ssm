package com.itheima.entity;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private Integer uid;
    private String name;
    private String password;
    private String email;
    private Date birthday;

}