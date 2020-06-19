package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.models.lookups.LKPCountry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "user_id"))
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
    private Date registerDate;

    @NotNull
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private LKPCountry country;

    @ManyToOne
    private LKPCity city;
}
