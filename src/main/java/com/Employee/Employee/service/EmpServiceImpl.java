package com.Employee.Employee.service;

import com.Employee.Employee.dao.EmpDao;
import com.Employee.Employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmpServiceImpl implements EmpService{

    @Autowired
    public EmpDao dao;
    @Override
    public List<Employee> getEmployees() {
        return dao.getEmployees();
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return dao.getEmployee(employeeId);
    }

    @Override
    public Employee createEmployee(Employee emp) {
        return dao.createEmployee(emp);
    }

    @Override
    public Employee updateEmployee(int employeeId, Employee emp) {
        return dao.updateEmployee(employeeId,emp);
    }

    @Override
    public Employee deleteEmployee(int employeeId) {
        return dao.deleteEmployee(employeeId);
    }
}
