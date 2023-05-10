package com.Employee.Employee.service;

import com.Employee.Employee.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {

    public List<Employee> getEmployees();
    public Employee getEmployee(int employeeId);
    public Employee createEmployee(Employee emp);
    public Employee updateEmployee(int employeeId,Employee emp);
    public Employee deleteEmployee(int employeeId);
}
