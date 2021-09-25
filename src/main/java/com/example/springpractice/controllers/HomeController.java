package com.example.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showPage(){
        return "main-menu";
    }
}
