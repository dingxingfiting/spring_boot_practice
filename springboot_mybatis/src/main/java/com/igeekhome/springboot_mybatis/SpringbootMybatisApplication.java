package com.igeekhome.springboot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描basePackages包下的所有@Mapper修饰的接口 为之生成代理对象
@MapperScan(basePackages = {"com.igeekhome.springboot_mybatis.mapper"})
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}

