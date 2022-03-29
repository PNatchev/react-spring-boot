package com.example.reactspringboot.persistance;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Users {
    @Getter @Setter public String name;
    @Getter @Setter public String salary;
    @Getter @Setter public Integer id;

    public Users(String name,String salary, Integer id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
}
