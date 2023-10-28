package com.example.employeeManagement.controller;

import com.example.employeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employeeManagement.entity.EmployeeData;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService emp_serv;

    @GetMapping("/value")
    public List<EmployeeData> getEmployees(){
        return emp_serv.getEmployees();
    }


}
