package com.immediatlyApp.models.proba;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.proba.TestEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table
public class TestEntity2   extends BaseEntity {

    String name;
    @ManyToOne
    TestEntity te;

}
