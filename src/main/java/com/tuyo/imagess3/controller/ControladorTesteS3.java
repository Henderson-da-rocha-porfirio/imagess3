package com.tuyo.imagess3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControladorTesteS3 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

}
