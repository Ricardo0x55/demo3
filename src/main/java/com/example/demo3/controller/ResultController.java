package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myApp")
public class ResultController{

    @GetMapping
    public String getResultPage() {
        return "index";
    }

}
