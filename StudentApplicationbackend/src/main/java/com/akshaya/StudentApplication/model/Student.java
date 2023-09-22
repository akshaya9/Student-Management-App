package com.akshaya.StudentApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id  //    primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //     Make it auto-incremented
    private int id;
    private String name;
    private String addr;

}