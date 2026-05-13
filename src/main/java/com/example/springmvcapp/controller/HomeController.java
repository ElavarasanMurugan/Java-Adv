package com.example.springmvcapp.controller;

import com.example.springmvcapp.model.WelcomeMessage;
import com.example.springmvcapp.service.WelcomeService;
import com.example.springmvcapp.view.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final WelcomeService welcomeService;

    public HomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/")
    public String home(Model model) {
        WelcomeMessage welcomeMessage = new WelcomeMessage(welcomeService.getWelcomeMessage());
        model.addAttribute("welcomeMessage", welcomeMessage);
        return ViewNames.HOME;
    }
}
