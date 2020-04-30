package com.immediatlyApp.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
@Data
public class TestEntity {

    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "name")
    private String name;


}
