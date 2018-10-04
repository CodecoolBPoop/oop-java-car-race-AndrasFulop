package com.codecool;

import java.util.Random;

public class Weather {
    public final Boolean isRaining;

    Weather() {
        isRaining = setRaining();
    }

    private Boolean setRaining() {
        Random rad = new Random();
        int chanceOfRain = rad.nextInt(100);
        return chanceOfRain <= 30;
    }
}
