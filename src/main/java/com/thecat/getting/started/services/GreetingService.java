package com.thecat.getting.started.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Hello " + name;
    }

}
