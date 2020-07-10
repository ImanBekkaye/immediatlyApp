package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.models.lookups.LKPCountry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "user_country_review_id"))
public class UserCountryReview extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private LKPCountry country;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    private LKPCity city;

    private String visitedPlaces;
    private String tripTitle;
    private Date fromDate;
    private Date toDate;
    private String description;
    private String tripImage;
    private Boolean publicReview;
}
