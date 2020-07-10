package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.UserOfferServiceType;
import com.immediatlyApp.services.UserOfferServiceTypeService;
import com.immediatlyApp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
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
    public void addUserOfferServiceType(@RequestBody @Valid UserOfferServiceType userOfferServiceType) throws UnsupportedEncodingException {
        userOfferServiceTypeService.addUserOfferServiceType(userOfferServiceType);
    }

    @GetMapping("/{username}")
    public List<UserOfferServiceType> getUserOfferServiceTypesByUsername(@PathVariable String username){
        return userOfferServiceTypeService.getUserOfferServiceTypesByUsername(username);
    }
}
