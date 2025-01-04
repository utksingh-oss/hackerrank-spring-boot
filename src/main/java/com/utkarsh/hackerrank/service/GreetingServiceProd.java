package com.utkarsh.hackerrank.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class GreetingServiceProd implements IGreetingService {
    private static final String WELCOME_MESSAGE = "Welcome to Spring MVC with spring boot";
    private static final String ENVIRONMENT = "Prod";

    @Override
    public String getGreeting(String name) {
        return WELCOME_MESSAGE + " " + name + " " + ENVIRONMENT;
    }
}
