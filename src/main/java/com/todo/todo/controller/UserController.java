package com.todo.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/public")
    public String publicEndpoint() {
        return "public";
    }
    @GetMapping("/account")
    public String accountEndpoint() {
        return "private";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "admin";
    }
}
