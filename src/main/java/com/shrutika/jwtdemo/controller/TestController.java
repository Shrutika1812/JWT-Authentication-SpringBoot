package com.shrutika.jwtdemo.controller;

import com.shrutika.jwtdemo.dto.LoginRequest;
import com.shrutika.jwtdemo.dto.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "App is running successfully";
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        if ("shruti".equals(request.getUsername()) &&
                "shruti123".equals(request.getPassword())) {

            return new LoginResponse("DUMMY_TOKEN");
        }

        throw new RuntimeException("Invalid credentials");
    }
}
