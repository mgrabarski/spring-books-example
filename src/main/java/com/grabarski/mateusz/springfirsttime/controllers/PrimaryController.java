package com.grabarski.mateusz.springfirsttime.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void printMessage() {
        System.out.println(greetingService.provideMessage());
    }
}
