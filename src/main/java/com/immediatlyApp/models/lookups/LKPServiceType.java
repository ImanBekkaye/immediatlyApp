package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.LookupEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "LKP_Service_Type")
public class LKPServiceType extends LookupEntity {


    @Builder
    public LKPServiceType(String name, String key) {
        super(name,key);


    }
}
