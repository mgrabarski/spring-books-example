package com.grabarski.mateusz.springfirsttime.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorMyController {

    private final GreetingService greetingService;

    public ConstructorMyController(@Qualifier("greetingConstructorService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void someMessage() {
        System.out.println(greetingService.provideMessage());
    }
}
