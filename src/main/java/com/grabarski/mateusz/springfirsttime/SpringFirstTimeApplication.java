package com.grabarski.mateusz.springfirsttime;

import com.grabarski.mateusz.springfirsttime.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstTimeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringFirstTimeApplication.class, args);

        MyController myController = applicationContext.getBean(MyController.class);
        myController.someMessage();
    }
}
