package com.Employee.Employee.dao;

import com.Employee.Employee.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmpDaoImpl implements EmpDao{

    static int count = 1000;
    static List<Employee> employeeList =new ArrayList<Employee>();
    static {
        employeeList.add(new Employee(++count,"admin","admin@xyz.com"));
        employeeList.add(new Employee(++count,"user","user@xyz.com"));
    }
    @Override
    public List<Employee> getEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        Employee tempEmp=null;
        for(Employee emp:employeeList){
            if(emp.getEmployeeId()==employeeId){
                tempEmp=emp;
                break;
            }
        }
        return tempEmp;
    }

    @Override
    public Employee createEmployee(Employee emp) {
        Employee tempEmp=new Employee(++count,emp.getEmployeeName(),emp.getEmployeeEmail());
        employeeList.add(tempEmp);
        return tempEmp;
    }

    @Override
    public Employee updateEmployee(int employeeId, Employee emp) {
        Employee tempEmp=null;
        for(Employee employee:employeeList){
            if(employee.getEmployeeId()==employeeId){
                employee.setEmployeeName(emp.getEmployeeName());
                employee.setEmployeeEmail(emp.getEmployeeEmail());
                tempEmp=employee;
                break;
            }
        }
        return tempEmp;    }

    @Override
    public Employee deleteEmployee(int employeeId) {
        Employee tempEmp=null;
        for(Employee emp:employeeList){
            if(emp.getEmployeeId()==employeeId){
                tempEmp=emp;
                employeeList.remove(emp);
                break;
            }
        }
        return tempEmp;    }
}
