package com.Employee.Employee.dao;

import com.Employee.Employee.entity.Employee;

import java.util.List;

public interface EmpDao {
    public List<Employee> getEmployees();
    public Employee getEmployee(int employeeId);
    public Employee createEmployee(Employee emp);
    public Employee updateEmployee(int employeeId,Employee emp);
    public Employee deleteEmployee(int employeeId);


}
