package com.example.smarthome;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Guest";
    private String homeId = "23456";

    public String getName() {
        return name;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }
}
