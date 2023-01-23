package com.codeup.blogpost.controllers;

import com.codeup.blogpost.services.EmailService;
import org.springframework.stereotype.Controller;

@Controller
class AdController {
    // ...
    private final EmailService emailService;

    public AdController(EmailService emailService) {
        this.emailService = emailService;
    }
    // ...
}