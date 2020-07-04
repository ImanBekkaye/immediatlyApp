package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.LookupEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "LKP_City")
@NoArgsConstructor
@AllArgsConstructor

public class LKPCity extends LookupEntity {

    @ManyToOne
    private LKPCountry lkpCountry;

    @Builder
    public LKPCity(String name,String key,LKPCountry country){
        super(name,key);
        this.lkpCountry = country;

    }



}
