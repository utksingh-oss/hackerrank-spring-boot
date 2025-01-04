package com.utkarsh.hackerrank.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IGreetingServiceTest {
    private static final String WELCOME_MESSAGE = "Welcome to Spring MVC with spring boot";

    @InjectMocks
    GreetingServiceDev greetingService;

    @Test
    public void testGreetingMessage() {
        String input = "Utkarsh";
        String greetingMessage = greetingService.getGreeting(input);
        Assert.assertTrue(greetingMessage.startsWith(WELCOME_MESSAGE));
        Assert.assertTrue(greetingMessage.contains(input));
    }
}