package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.LookupEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "LKP_Place_Filter")
public class LKPPlaceFilter extends LookupEntity {
    @Builder
    public LKPPlaceFilter(String name, String key){
        super(name,key);
    }
}
