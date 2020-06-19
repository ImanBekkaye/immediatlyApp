package com.immediatlyApp.repositories;

import com.immediatlyApp.models.lookups.LKPServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LKPRepository extends JpaRepository<LKPServiceType, Long> {
    LKPServiceType findLKPServiceByName(String name);
    //LKPServiceType findLKPServiceByKey(String key);
}
