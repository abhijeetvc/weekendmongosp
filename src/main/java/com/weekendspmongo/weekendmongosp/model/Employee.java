package com.weekendspmongo.weekendmongosp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Getter
@Setter
public class Employee {

    @Id
    private String id;

    private String name;
    private String city;

    private List<String> emails;

    private List<Address> addressList;

    @DBRef
    private Department department;
}
