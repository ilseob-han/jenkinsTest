package com.example.jwt_login.home;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("성공");
    }

}
