package com.grabarski.mateusz.springfirsttime.controllers.beans;

import com.grabarski.mateusz.springfirsttime.controllers.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String provideMessage() {
        return "Hello - primary service";
    }
}
