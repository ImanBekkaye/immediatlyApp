package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Table
public class User  extends BaseEntity{

    @Column(length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
    private String username;

    @Column(length = 100)
    @NotNull
    @Size(min = 4, max = 100)
    private String password;

    @Column(length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String firstName;


    @Column(length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String lastName;

    @Column(length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
    private String email;

    @Column(length = 50)
    @Size(min = 4, max = 50)
    private String address;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date registerDate;

    @NotNull
    private Date dateOfBirth;

}
