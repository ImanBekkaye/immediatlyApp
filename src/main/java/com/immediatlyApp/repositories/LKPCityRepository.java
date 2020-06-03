package com.immediatlyApp.repositories;

import com.immediatlyApp.models.lookups.LKPCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LKPCityRepository extends JpaRepository<LKPCity,Long> {
    LKPCity findLKPCityByName(String name);
    LKPCity findLKPCityByKey(String key);
}
