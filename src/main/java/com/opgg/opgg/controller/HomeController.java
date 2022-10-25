package com.opgg.opgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/home")
    public String hello(){
        return "home";
    }
    @GetMapping("/search")
    public String search(){
        return "result";
    }
}
