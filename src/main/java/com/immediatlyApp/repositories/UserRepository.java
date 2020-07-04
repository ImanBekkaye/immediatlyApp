package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    @Override
    @Query("SELECT u FROM User u INNER JOIN u.country")
    List<User> findAll();
}
