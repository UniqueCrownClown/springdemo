package com.example.demo.model.bean;

import lombok.Data;

@Data
public class StudentBean {
    private String name;
    private String age;
    public String setName(String name) {

        return "my name is:" + name;
    }

}
