package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.core.LookupEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "LKP_Country")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverride(name = "id" ,column = @Column(name = "country_id"))
public class LKPCountry extends BaseEntity {
    @NotNull
    private String name;
}
