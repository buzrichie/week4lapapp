package org.week6lap.week4lapapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello from Spring Boot!");
        return "index";
    }

//    @GetMapping("/hello")
//    public String hello(Model model) {
//        model.addAttribute("greeting", "Hello, world! 🚀");
//        return "hello";
//    }
}
