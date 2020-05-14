package com.immediatlyApp.models;


import com.immediatlyApp.core.BaseEntity;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table
public class TestEntity extends BaseEntity {

    private String name;
    private String key;

    protected TestEntity(){
         super();
     }



}
