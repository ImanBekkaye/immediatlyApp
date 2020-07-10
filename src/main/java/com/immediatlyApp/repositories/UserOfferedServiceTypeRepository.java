package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.UserOfferServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserOfferedServiceTypeRepository extends JpaRepository <UserOfferServiceType,Long> {
    @Query("SELECT uost from UserOfferServiceType uost where uost.user.username = :username ")
    List<UserOfferServiceType> getUserOfferServiceTypesByUsername(String username);
}
