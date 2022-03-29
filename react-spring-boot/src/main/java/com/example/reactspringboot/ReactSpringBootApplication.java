package com.example.reactspringboot;

import com.example.reactspringboot.persistance.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@MappedTypes(Users.class)
@MapperScan("com.example.reactspringboot.persistance")
@Configuration
@SpringBootApplication
public class ReactSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactSpringBootApplication.class, args);
    }

}
