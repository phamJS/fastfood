package com.example.Fast.Food.affectbrain.service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;

@Setter
@Table(name = "employee")
@Entity
public class UserEntity {

    @Id
    @Column(name = "id")
    public Integer id;

    @Column(name = "age")
    public Integer age;

    @Column(name = "name")
    public String name;

    @Column(name = "email")
    public String email;
}
