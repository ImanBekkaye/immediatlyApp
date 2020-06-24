package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.UserOfferServiceType;
import com.immediatlyApp.services.UserOfferServiceTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-offer-service-type")
public class UserOfferServiceTypeController {
    private final UserOfferServiceTypeService userOfferServiceTypeService;

    @GetMapping("/all")
    public List<UserOfferServiceType> getUserOfferServiceTypes(){
        return userOfferServiceTypeService.getUserOfferServiceTypes();
    }

    @PostMapping("/add")
    public void addUserOfferServiceType(@RequestBody @Valid UserOfferServiceType userOfferServiceType){
        userOfferServiceTypeService.addUserOfferServiceType(userOfferServiceType);
    }
}
