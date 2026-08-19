package com.shrutika.jwtdemo.controller;

import com.shrutika.jwtdemo.dto.LoginRequest;
import com.shrutika.jwtdemo.jwt.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        System.out.println("LOGIN API HIT");

        if ("shruti".equals(request.getUsername()) &&
                "shruti123".equals(request.getPassword())) {

            // 🔑 Generate JWT token
            return JwtUtil.generateToken(request.getUsername());
        }

        return "INVALID USERNAME OR PASSWORD";
    }
}
