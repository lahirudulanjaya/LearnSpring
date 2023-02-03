package com.example.springProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestEnvironment {
    @Autowired
    private Environment environment;

    public String getActiveEnvironment() {
        String activeProfile = environment.getActiveProfiles()[0];
        System.out.println(activeProfile);
        return activeProfile;
    }

}
