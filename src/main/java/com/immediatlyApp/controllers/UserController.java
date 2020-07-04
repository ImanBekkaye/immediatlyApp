package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.User;
import com.immediatlyApp.services.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {


    private final UserService userService;
    private final PasswordEncoder bcryptEncoder;

    @PostMapping("/register")
    public void saveUser(@RequestBody User user){
        user.setPassword(bcryptEncoder.encode(user.getPassword()));
        userService.addUser(user);
    }
    @DeleteMapping("/delete/{userId}/")
    public void deleteUser(@PathVariable @Valid long userId){
        userService.deleteById(userId);
    }
    @GetMapping("/all")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/findByEmail/{email}/")
    public User findByEmail(@PathVariable @Valid String email){
        return userService.findByEmail(email);
    }
    @GetMapping("/findByUsername/{username}/")
    public User findByUsername(@PathVariable @Valid String username){
        return userService.findByUsername(username);
    }

}
