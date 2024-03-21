package com.example.SpringThymeleaf.dao;

import com.example.SpringThymeleaf.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {
}
