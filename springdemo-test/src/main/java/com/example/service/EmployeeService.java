package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.po.Employee;

public interface EmployeeService extends IService<Employee> {
    void login();
}
