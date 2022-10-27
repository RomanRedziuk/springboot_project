package com.romanredziuk.spring.springboot.springboot_project0.dao;


import com.romanredziuk.spring.springboot.springboot_project0.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
