package com.immediatlyApp.core;


import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    protected BaseEntity(){
        id = null;
    }
}
