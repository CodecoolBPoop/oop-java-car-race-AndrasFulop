package com.codecool;

import java.util.Random;

public class Motorcycle extends Vehicle {

    public Motorcycle(int motorcycleNumber) {
        this.name = "Motorcycle" + (motorcycleNumber+1);
    }

    @Override
    public void setSpeed(Boolean isRaining, Boolean isThereABrokenTruck) {
        if (isRaining) {
            Random rad = new Random();
            speed = rad.nextInt(95-50)+50;
        } else {
            speed = 100;
        }
    }
}
