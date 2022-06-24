package com.ryumin.spring.springboot.dao;



import com.ryumin.spring.springboot.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
