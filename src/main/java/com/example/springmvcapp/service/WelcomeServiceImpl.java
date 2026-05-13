package com.example.springmvcapp.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String getWelcomeMessage() {
        return "Welcome to Spring MVC Application";
    }
}
