package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.LookupEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Table (name = "LKP_Impression")
public class LKPImpression extends LookupEntity {

    @Builder
    LKPImpression(String name,String key){
        super(name,key);
    }
}
