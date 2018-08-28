package com.grabarski.mateusz.springfirsttime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterMyController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("greetingSetterService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void printMessage() {
        System.out.println(greetingService.provideMessage());
    }
}
