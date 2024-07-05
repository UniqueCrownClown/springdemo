package com.example.service;

import com.example.config.SpringConfig;
import com.example.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class EmployeeServiceTerst {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testGetById() {
        Employee employee = employeeService.getById(1);
        System.out.println(employee);
    }

    @Test
    public void testGetAll() {
        List<Employee> employeeList = employeeService.getAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }


}
