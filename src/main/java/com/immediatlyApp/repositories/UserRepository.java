package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    @Override
    @Query("SELECT u FROM User u INNER JOIN u.country")
    List<User> findAll();

    @Transactional
    @Modifying
    @Query("UPDATE User set profileImage = :image where username = :user")
    void editProfileImage(String user, byte[] image);

    @Query("SELECT profileImage from User where username = :user")
    byte[] getUserProfileImage(String user);
}


