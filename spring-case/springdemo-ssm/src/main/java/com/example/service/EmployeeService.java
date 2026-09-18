package com.example.service;

import com.example.domain.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EmployeeService {

    public boolean save(Employee employee);

    public boolean update(Employee employee);

    public boolean delete(Integer id);

    public Employee getById(Integer id);

    public List<Employee> getAll();
}
