package com.example.controller;

import com.example.domain.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public boolean save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping
    public boolean update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return employeeService.delete(id);
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Integer id) {
        return employeeService.getById(id);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}
