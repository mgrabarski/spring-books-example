package com.grabarski.mateusz.springfirsttime;

import com.grabarski.mateusz.springfirsttime.controllers.ConstructorMyController;
import com.grabarski.mateusz.springfirsttime.controllers.PrimaryController;
import com.grabarski.mateusz.springfirsttime.controllers.SetterMyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstTimeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringFirstTimeApplication.class, args);

        ConstructorMyController myController = applicationContext.getBean(ConstructorMyController.class);
        myController.someMessage();

        SetterMyController setterMyController = applicationContext.getBean(SetterMyController.class);
        setterMyController.printMessage();

        PrimaryController primaryController = applicationContext.getBean(PrimaryController.class);
        primaryController.printMessage();
    }
}
