package com.weekendspmongo.weekendmongosp.controller;

import com.weekendspmongo.weekendmongosp.model.Employee;
import com.weekendspmongo.weekendmongosp.repository.EmployeeRepository;
import com.weekendspmongo.weekendmongosp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public String saveData(@RequestBody Employee employee){
        return employeeService.saveEmp(employee);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        Optional<Employee> emp=employeeRepository.findById(employee.getId());
        if(emp.isPresent()){
            emp.get().setName(employee.getName());
            emp.get().setCity(employee.getCity());
            employeeRepository.save(emp.get());
            return "Employee updated!!!";
        }
        return "Employee Not found!!!";
    }
}
