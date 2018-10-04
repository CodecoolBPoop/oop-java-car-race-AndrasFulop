package com.codecool;

public abstract class Vehicle {
    protected String name;
    protected int distanceTravelled = 0;
    protected int speed;
    protected int brokendownTurnLeft = 0;

    public String getName() {
        return name;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void moveForAnHour(Race race) {
        setSpeed(race.weather.isRaining, race.isThereABrokenTruck());
        distanceTravelled += speed;
    }

    public abstract void setSpeed(Boolean isRaining, Boolean isThereABrokenTruck);

}
