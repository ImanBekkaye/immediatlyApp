package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.LookupEntity;
import com.immediatlyApp.models.entity.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "LKP_Country")
@NoArgsConstructor

public class LKPCountry extends LookupEntity {

    @Builder
    public LKPCountry(String name,String key){
        super(name,key);
    }

}
