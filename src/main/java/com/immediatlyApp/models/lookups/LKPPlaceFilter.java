package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.LookupEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
@Builder
public class LKPPlaceFilter extends LookupEntity {
    public LKPPlaceFilter(String name, String key){
        super(name,key);
    }
}
