package dev.ihsankarim.erp_finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ihsankarim.erp_finance.dto.auth.AuthRequest;
import dev.ihsankarim.erp_finance.dto.auth.AuthResponse;
import dev.ihsankarim.erp_finance.model.Role;
import dev.ihsankarim.erp_finance.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody AuthRequest request) {
        System.out.println("REGISTER: " + request.getUsername());
        userService.register(request.getUsername(), request.getPassword() , Role.STAFF_KEUANGAN);
        return ResponseEntity.ok("Registration successful");
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        Authentication auth = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
            request.getUsername(),
            request.getPassword()
            )
        );
        return ResponseEntity.ok(new AuthResponse("Login successful", null));    
    }
}
