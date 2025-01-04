package com.utkarsh.hackerrank.controller;

import com.utkarsh.hackerrank.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/home/{name}")
    public String home(Model model, @PathVariable String name) {
        String message = greetingService.getGreeting(name);
        model.addAttribute("message", message);
        return "home";
    }
}
