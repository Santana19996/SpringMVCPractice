package com.example.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
//    create a mapping for "/hello"

    @GetMapping("/hello")
    public String sayHello(Model theModel) {
//        making theDate accessible in thymeleaf template
        theModel.addAttribute("theDate",new java.util.Date());
        return "helloworld";
    }
}
