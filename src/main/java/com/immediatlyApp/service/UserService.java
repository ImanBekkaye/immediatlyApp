package com.immediatlyApp.service;

import com.immediatlyApp.models.User;
import com.immediatlyApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void deleteById(Long id){
        if (id == null) {
            throw new IllegalArgumentException("User id must be specified!");
        }
        try{
            userRepository.deleteById(id);
        }catch (Exception e){
            throw new IllegalArgumentException("Could not delete employee academic title.");
        }
    }

}
