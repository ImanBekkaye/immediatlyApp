package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.models.lookups.LKPCountry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCountry extends BaseEntity {
//Table User is going to visit country
    @ManyToOne
    private User user;
    @ManyToOne
    private LKPCountry country;
    @ManyToOne
    private LKPCity city;
    private Date from_date;
    private Date to_date;
}
