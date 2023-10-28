package com.example.employeeManagement.service;

import com.example.employeeManagement.entity.EmployeeData;
import com.example.employeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    //Get
    public List<EmployeeData> getEmployees(){

        List<EmployeeData> empList = new ArrayList<EmployeeData>();
        empRepo.findAll().forEach(emp -> empList.add(emp));
        return empList;
    }
}
