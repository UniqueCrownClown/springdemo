package com.example.controller;

import com.example.result.Result;
import com.example.service.EmployeeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/employee")
@Api(tags = "管理员模块")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("/login")
    public void login() {
        employeeService.login();
    }

    @GetMapping("/logout")
    public Result logout() {
        int i = 1 / 0;
        return Result.success();
    }
}
