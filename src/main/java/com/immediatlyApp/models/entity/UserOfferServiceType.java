package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPServiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "user_offer_service_type_id"))
public class UserOfferServiceType extends BaseEntity {

    private String description;
    private Date fromDate;
    private Date toDate;
    private int maxPerson;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private LKPServiceType serviceType;


}
