package com.spring.ecommerceapplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")

public class HelloController {

    @GetMapping("/get")
    public String getHello() {
        return "Hello World!";
    }

    @PostMapping()
        public String postHello() {
            return "Hello World";
        }

    @PutMapping()
    public String putHello() {
        return "Put Hello World";
    }

    @DeleteMapping()
    public String deleteHello() {
        return "Delete Hello World";
    }
}
