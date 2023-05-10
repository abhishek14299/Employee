package com.Employee.Employee.controller;

import com.Employee.Employee.customError.Not_Found_Exception;
import com.Employee.Employee.entity.Employee;
import com.Employee.Employee.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    public EmpService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployee(@PathVariable("id") int employeeId){
        Employee employee=service.getEmployee(employeeId);
        if(employee==null){
            throw new Not_Found_Exception("Employee with id="+employeeId+" not found");
        }
        return employee;
    }

    @RequestMapping(value = "/addEmp", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee emp){
        System.out.println(emp);
        return service.createEmployee(emp);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable("id") int employeeId,@RequestBody Employee emp){
        Employee employee=service.updateEmployee(employeeId,emp);
        if(employee==null){
            throw new Not_Found_Exception("Employee with id="+employeeId+" not found");
        }
        return employee;
    }

    @RequestMapping(value = "/deleteEmp/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Employee deleteEmployee(@PathVariable("id") int employeeId){
        Employee employee=service.deleteEmployee(employeeId);
        if(employee==null){
            throw new Not_Found_Exception("Employee with id="+employeeId+" not found");
        }
        return employee;
    }
}
