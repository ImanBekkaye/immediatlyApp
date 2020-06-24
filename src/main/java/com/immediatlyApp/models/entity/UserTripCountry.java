package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.models.lookups.LKPCountry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "user_trip_country_id"))
public class UserTripCountry extends BaseEntity {
//Table User is going to visit country
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private LKPCountry country;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    private LKPCity city;

    private Date from_date;
    private Date to_date;
}
