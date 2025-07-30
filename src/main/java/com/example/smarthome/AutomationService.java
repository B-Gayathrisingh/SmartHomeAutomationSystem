package com.example.smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationService {

    @Autowired
    private User user;

    @Autowired
    private Device device;

    public void controlDevice() {
        System.out.println("User: " + user.getName() + " is controlling device: " + device.getType());
        device.turnOn();
    }
}
