package com.codeup.blogpost.repositories;

import com.codeup.blogpost.model.PostDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDetailsRepository extends JpaRepository<PostDetails, Long> {
}