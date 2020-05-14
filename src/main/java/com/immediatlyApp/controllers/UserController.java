package com.immediatlyApp.controllers;


import com.immediatlyApp.models.entity.User;
import com.immediatlyApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/save/", method = RequestMethod.POST)
    public void addUser(@RequestBody @Valid User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/user/delete/{userId}/", method = RequestMethod.DELETE)
    public void addUser(@PathVariable long userId){
        userService.deleteById(userId);
    }

    @RequestMapping(value = "/user/all/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<User>  getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(value = "/user/findByEmail/{email}/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public User findByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }

    @RequestMapping(value = "/user/findByUsername/{username}/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public User findByUsername(@PathVariable String username){
        return userService.findByUsername(username);
    }




}
