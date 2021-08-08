package com.weekendspmongo.weekendmongosp.service;

import com.weekendspmongo.weekendmongosp.model.Employee;
import com.weekendspmongo.weekendmongosp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveEmp(Employee employee){
        System.out.println("111111111111111");
        employeeRepository.save(employee);
        return "Employee saved!!!";
    }
}
