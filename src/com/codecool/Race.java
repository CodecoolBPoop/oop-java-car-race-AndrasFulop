package com.codecool;

import java.util.ArrayList;

public class Race {

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    public Weather weather = new Weather();

    public void createVehicle() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car(i));
            vehicles.add(new Truck(i));
            vehicles.add(new Motorcycle(i));
        }
    }

    public void simulateRace(int turns) {
        for (int turn = 0; turn < turns; turn++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour(this);
            }
        }

    }

    public Boolean isThereABrokenTruck() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.brokendownTurnLeft > 0) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void printRaceResults() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle name: " + vehicle.getName() + ", distance travelled: " + vehicle.getDistanceTravelled() + "km");
        }
    }
}
