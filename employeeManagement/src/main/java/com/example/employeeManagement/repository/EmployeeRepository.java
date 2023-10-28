package com.example.employeeManagement.repository;
import com.example.employeeManagement.entity.EmployeeData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeData,Integer> {

//
//    @Query(value = "select u EmployeeData u")
//    List<EmployeeData> getAllData();
}
