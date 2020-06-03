package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.LookupEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "LKP_Country")

public class LKPCountry extends LookupEntity {

    @Builder
    LKPCountry(String name,String key){
        super(name,key);
    }
}
