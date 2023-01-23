package com.codeup.blogpost.repositories;


import com.codeup.blogpost.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}