package com.example.reactspringboot.resource;

import com.example.reactspringboot.persistance.Users;
import com.example.reactspringboot.persistance.UsersDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersResource {

    private static final Logger log = LoggerFactory.getLogger(Users.class);
    private UsersDao usersDao;
    public UsersResource(UsersDao usersDao){
        this.usersDao = usersDao;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        List<Users> test = usersDao.findAll();
        log.error("test");
        return test;
    }

    @GetMapping("/insertuser")
    public int insertUser(){
        Users user = new Users("Joe", "5050",5);

        int insertCount = usersDao.insert(user);
        return insertCount;
    }


}
