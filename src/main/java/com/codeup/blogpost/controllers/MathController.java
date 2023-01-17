package com.codeup.blogpost.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {
    @RequestMapping(path = "/add/{number}/and/4", method = RequestMethod.GET)
    @ResponseBody
    public String addFour(@PathVariable int number) {
        return number + " plus four is " + (number + 4) + "!";
    }
    @RequestMapping(path = "/subtract/3/from/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String subThree(@PathVariable int number) {
        return number + " minus three is " + (number - 3) + "!";
    }
    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String mulFour(@PathVariable int number) {
        return number + " times four is " + (number * 4) + "!";
    }
}
