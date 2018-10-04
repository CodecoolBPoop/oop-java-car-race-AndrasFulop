package com.codecool;

import java.util.Random;

public class Truck extends Vehicle{

    private int normalSpeed;

    public Truck(int truckNumber) {
        Random rad = new Random();
        this.name = Integer.toString(rad.nextInt(1000));
        this.normalSpeed = 100;
    }

    public void brokenDown() {
        Random rad = new Random();
        int chanceOfBrakedown = rad.nextInt(100);
        if (chanceOfBrakedown <= 5){
            brokendownTurnLeft = 2;
        }
    }

    @Override
    public void setSpeed(Boolean isRaining, Boolean isThereABrokenTruck) {
        if (brokendownTurnLeft == 0) {
            speed = 100;
            brokenDown();
        } else {
            brokendownTurnLeft--;
            speed = 0;
        }
    }
}
