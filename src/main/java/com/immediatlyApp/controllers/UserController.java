package com.immediatlyApp.controllers;


import com.immediatlyApp.models.User;
import com.immediatlyApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/save/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(value = "/user/delete/{userId}/", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
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
