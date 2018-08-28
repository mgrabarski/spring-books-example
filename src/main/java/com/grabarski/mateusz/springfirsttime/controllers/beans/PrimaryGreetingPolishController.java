package com.grabarski.mateusz.springfirsttime.controllers.beans;

import com.grabarski.mateusz.springfirsttime.controllers.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("pl")
@Primary
public class PrimaryGreetingPolishController implements GreetingService {
    @Override
    public String provideMessage() {
        return "Siema - to jest pl";
    }
}
