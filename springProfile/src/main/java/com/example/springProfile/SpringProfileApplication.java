package com.example.springProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SpringProfileApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringProfileApplication.class, args);
        TestEnvironment testEnvironment = ctx.getBean(TestEnvironment.class);
        testEnvironment.getActiveEnvironment();

    }

}
