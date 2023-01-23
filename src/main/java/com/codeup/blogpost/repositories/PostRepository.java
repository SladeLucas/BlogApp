package com.codeup.blogpost.repositories;

import com.codeup.blogpost.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}