package com.codeup.blogpost.controllers;

import org.springframework.web.bind.annotation.*;

public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "Post index page";
    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String indi() {
        return "view an individual post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "view the form for creating a post";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String post() {
        return "create a new post";
    }
}
