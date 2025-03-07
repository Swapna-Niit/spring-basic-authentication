package com.crimsonlogic.springbootbasicsecurityexample.controller;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
    @GetMapping("/")
    public String greeting(Authentication authentication) {
    	
    	String userName = authentication.getName();
    	
        return "Spring Security In-memory Authentication Example - Welcome " + userName;
    }

}