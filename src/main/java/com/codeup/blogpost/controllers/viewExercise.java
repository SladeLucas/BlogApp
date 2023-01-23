package com.codeup.blogpost.controllers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewExercise {

    @RequestMapping(path = "roll-dice/{number}", method = RequestMethod.GET)
    @GetMapping("/roll-dice/{number}")
    public String add(@PathVariable int number, Model model) {
        int rollDice = (int) (Math.floor(Math.random() * 6) + 1);
        model.addAttribute("guess", number);
        model.addAttribute("randNum", rollDice);
    if(rollDice == number) {
        model.addAttribute("match", true);
    } else {
        model.addAttribute("match", false);
    }
        return "roll-dice";
    }

}