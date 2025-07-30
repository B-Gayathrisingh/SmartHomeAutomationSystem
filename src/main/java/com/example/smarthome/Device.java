package com.example.smarthome;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String type = "AC";
    private boolean status = false;

    public void turnOn() {
        status = true;
        System.out.println(type + " is turned ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(type + " is turned OFF.");
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public String getType() {
        return type;
    }
}
