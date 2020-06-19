package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.core.LookupEntity;
import com.immediatlyApp.models.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;


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

    @OneToMany(mappedBy = "country")
    List<User> users = new ArrayList<>();



    public void addUser(User user) {
        this.users.add(user);
    }
}
