package com.grabarski.mateusz.springfirsttime.controllers.beans;

import com.grabarski.mateusz.springfirsttime.controllers.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class GreetingSetterService implements GreetingService {
    @Override
    public String provideMessage() {
        return "Hello - inject in setter method";
    }
}
