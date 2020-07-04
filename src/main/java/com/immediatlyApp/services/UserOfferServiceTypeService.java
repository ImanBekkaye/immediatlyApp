package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.UserOfferServiceType;
import com.immediatlyApp.repositories.UserOfferedServiceTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserOfferServiceTypeService {
    private final UserOfferedServiceTypeRepository userOfferedServiceTypeRepository;


    public void addUserOfferServiceType(UserOfferServiceType userOfferServiceType) {
        userOfferedServiceTypeRepository.save(userOfferServiceType);
    }

    public List<UserOfferServiceType> getUserOfferServiceTypes() {
        return userOfferedServiceTypeRepository.findAll();
    }
}
