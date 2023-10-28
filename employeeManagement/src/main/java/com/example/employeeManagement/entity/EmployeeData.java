package com.example.employeeManagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "empData")
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column(name = "empName")
    private String empName;

    @Column(name = "empAge")
    private Integer empAge;

    @Column(name = "empGender")
    private String empGender;

    @Column(name = "empPosition")
    private String empPosition;
    @Column(name = "empSalary")
    private Integer empSalary;

    @Column(name = "empCom")
    private String empCom;
    @Column(name = "empBranch")
    private String empBranch;

    public EmployeeData(){

    }

    public EmployeeData(String empName, Integer empAge, String empGender, String empPosition, Integer empSalary, String empCom, String empBranch) {
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empPosition = empPosition;
        this.empSalary = empSalary;
        this.empCom = empCom;
        this.empBranch = empBranch;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpCom() {
        return empCom;
    }

    public void setEmpCom(String empCom) {
        this.empCom = empCom;
    }

    public String getEmpBranch() {
        return empBranch;
    }

    public void setEmpBranch(String empBranch) {
        this.empBranch = empBranch;
    }
}
