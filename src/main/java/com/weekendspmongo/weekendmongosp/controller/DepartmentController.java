package com.weekendspmongo.weekendmongosp.controller;

import com.weekendspmongo.weekendmongosp.model.Department;
import com.weekendspmongo.weekendmongosp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;


    @PostMapping("/saveDept")
    public String saveDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return "Dept saved";

    }
}
