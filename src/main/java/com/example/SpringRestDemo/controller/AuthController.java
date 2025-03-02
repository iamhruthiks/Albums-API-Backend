package com.example.SpringRestDemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestDemo.payload.auth.Token;
import com.example.SpringRestDemo.payload.auth.UserLogin;
import com.example.SpringRestDemo.service.TokenService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public AuthController(TokenService tokenService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }
   
    @PostMapping("/token")
    @ResponseBody
    public Token token(@RequestBody UserLogin userLogin) throws AuthenticationException{
        Authentication authentication = authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(userLogin.email(), userLogin.password()));
        return new Token(tokenService.generateToken(authentication));
    }
    
}
