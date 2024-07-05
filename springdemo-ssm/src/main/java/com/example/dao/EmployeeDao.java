package com.example.dao;

import com.example.domain.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmployeeDao {

    @Insert("insert into employee values(null,#{username},#{name},#{password},#{phone},#{sex},#{idNumber},#{status})")
    public void save(Employee employee);

    @Update("update employee set username=#{username}, name=#{name} where id = #{id}")
    public void update(Employee employee);

    @Delete("delete from employee where id= #{id}")
    public void delete(Integer id);

    @Select("select * from employee where id = #{id}")
    public Employee getById(Integer id);

    @Select("select * from employee")
    public List<Employee> getAll();

}
