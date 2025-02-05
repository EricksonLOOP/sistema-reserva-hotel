package com.codebase.ms.auth.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/login")
    public ResponseEntity<?> authLogin(){
        return null;
    }
    @PostMapping("/signup")
    public ResponseEntity<?> authSignup(){
        return null;
    }
    @PostMapping("/logout")
    public ResponseEntity<?> authLogout(){
        return null;
    }
}
