package com.immediatlyApp.core;

import lombok.*;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class LookupEntity extends BaseEntity {
    @NotNull
     private String name;
    @NotNull
   private String key;
}