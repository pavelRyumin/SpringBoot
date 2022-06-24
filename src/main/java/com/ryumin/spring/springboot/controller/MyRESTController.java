package com.ryumin.spring.springboot.controller;

import com.ryumin.spring.springboot.entity.Employee;
import com.ryumin.spring.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployee = employeeService.getAllEmployees();
        return allEmployee;
    }

//    @GetMapping("/employees/{id}")
//    public Employee showEmployee(@PathVariable Integer id) {
//        Employee employee = employeeService.getEmployee(id);
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        employeeService.deleteEmployee(id);
//        return "Employee with id  = " + id + " was deleted";
//    }
}
