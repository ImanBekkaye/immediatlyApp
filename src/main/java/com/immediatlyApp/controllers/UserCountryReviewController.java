package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.UserCountryReview;
import com.immediatlyApp.services.UserCountryReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-country-review")
public class UserCountryReviewController {
    private final UserCountryReviewService userCountryReviewService;

    @GetMapping("/all")
    public List<UserCountryReview> getUserCountryReviews(){
        return userCountryReviewService.getUserCountryReviews();
    }

    @PostMapping("/add")
    public void addUserCountryReview(@RequestBody @Valid UserCountryReview userCountryReview){
        userCountryReviewService.addUserCountryReview(userCountryReview);
    }
}
