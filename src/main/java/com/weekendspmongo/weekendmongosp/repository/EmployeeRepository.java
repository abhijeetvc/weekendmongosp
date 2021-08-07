package com.weekendspmongo.weekendmongosp.repository;

import com.weekendspmongo.weekendmongosp.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
