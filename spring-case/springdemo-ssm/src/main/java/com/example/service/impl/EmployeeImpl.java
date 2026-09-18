package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public boolean save(Employee employee) {
        employeeDao.save(employee);
        return true;
    }

    public boolean update(Employee employee) {
        employeeDao.update(employee);
        return false;
    }

    public boolean delete(Integer id) {
        employeeDao.delete(id);
        return false;
    }

    public Employee getById(Integer id) {
        return employeeDao.getById(id);
    }

    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
