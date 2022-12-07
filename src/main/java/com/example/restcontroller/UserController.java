package com.example.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {

    private User user = new User("Kerry");

    @GetMapping
    public String findName() {
        return user.getName();
    }
}
