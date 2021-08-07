package com.weekendspmongo.weekendmongosp.repository;

import com.weekendspmongo.weekendmongosp.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department,String> {
}
