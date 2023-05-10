package com.Employee.Employee.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public int employeeId;
    public String employeeName;
    public String employeeEmail;

    public Employee() {
    }

    public Employee(String employeeName, String employeeEmail) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }

    public Employee(int employeeId, String employeeName, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + employeeId + '\'' +
                ", EmployeeName='" + employeeName + '\'' +
                ", EmployeeEmail='" + employeeEmail + '\'' +
                '}';
    }
}
