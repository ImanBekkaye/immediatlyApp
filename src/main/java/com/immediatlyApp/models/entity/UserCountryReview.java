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
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCountryReview extends BaseEntity {

    @ManyToOne
    User user;
    @ManyToOne
    private LKPCountry country;
    @ManyToOne
    private LKPCity city;
    String placesToVisit;
    String review;
}
