package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car extends Vehicle {

    private ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Spotlight", "Aurora", "Blade", "Empire",
            "Vigor", "Instinct", "Spire", "Portrait", "Albatros", "Eagle", "Blitz", "Triumph", "Catalyst",
            "Obsidian", "Thunder", "Twister", "Cobra", "Gallop", "Eternity", "Crusader"));

    private int normalSpeed;

    Car(int carNumber) {
        Random rad = new Random();
        this.normalSpeed =  rad.nextInt(110-80)+80;
        this.name = nameList.get(0+carNumber);
    }

    @Override
    public void setSpeed(Boolean isRaining, Boolean isThereABrokenTruck) {
        if (isThereABrokenTruck) {
            speed = 75;
        } else {
            speed = normalSpeed;
        }

    }
}
