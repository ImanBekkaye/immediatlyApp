package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class User extends BaseEntity {
    String firstName;
    String lastName;
    String username;

}
