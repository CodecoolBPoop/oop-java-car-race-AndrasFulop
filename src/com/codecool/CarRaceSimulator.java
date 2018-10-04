package com.codecool;

import java.util.Random;

public class CarRaceSimulator {
    public static void main(String[] args) {
       Race race = new Race();
       race.createVehicle();
       race.simulateRace(50);
       race.printRaceResults();

    }
}
