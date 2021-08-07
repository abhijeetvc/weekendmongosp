package com.weekendspmongo.weekendmongosp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Department {

    @Id
    private String id;
    private String name;
}
