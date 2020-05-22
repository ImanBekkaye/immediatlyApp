package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPServiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserOfferServiceType extends BaseEntity {

    private String description;
    private Date fromDate;
    private Date toDate;
    private int maxPerson;

    @ManyToOne
    private User user;
    @ManyToOne
    private LKPServiceType lkpServiceType;


}
