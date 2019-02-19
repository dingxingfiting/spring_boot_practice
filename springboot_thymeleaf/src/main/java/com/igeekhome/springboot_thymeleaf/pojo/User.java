package com.igeekhome.springboot_thymeleaf.pojo;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String telphone;
    private Date birthday;
    private int gender;//0 男 1 女 2 保密
    private String address;



}
