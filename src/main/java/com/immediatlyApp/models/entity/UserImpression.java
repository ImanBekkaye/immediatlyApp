package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPImpression;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserImpression extends BaseEntity {
    private String impression;

    @ManyToOne
    LKPImpression lkpImpression;
    @ManyToOne
    User user;
}
