package com.immediatlyApp.core;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class LookupEntity extends BaseEntity {
    String name;
    String key;
}