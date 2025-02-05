package com.codebase.ms.auth.Services.AuthServices;

import org.springframework.http.ResponseEntity;

public interface AuthServices {
    ResponseEntity<?> authLoginService();
    ResponseEntity<?> authSignupService();
    ResponseEntity<?> authLogoutService();
}
