package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.UserCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCountryRepository extends JpaRepository<UserCountry,Long> {
}
