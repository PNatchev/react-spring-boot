package com.example.reactspringboot.persistance;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao {

    @Select("SELECT * FROM users")
    @Results(id = "userMap", value = {
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "salary", property = "salary", jdbcType = JdbcType.VARCHAR),
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER)
    })
    List<Users> findAll();

    @Insert({
            "INSERT into USERS (name,salary,id) ",
            "values (#{name,jdbcType=VARCHAR}, #{salary,jdbcType=VARCHAR}, #{id,jdbcType=INTEGER})"
    })
    int insert(Users user);
}
