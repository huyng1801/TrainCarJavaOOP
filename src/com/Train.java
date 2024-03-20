package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Train {
    private String name;
    private int numCars;
    private ArrayList<TrainCar> cars;

    private Train(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

   public static Train create() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the name of the train: ");
    String name = scanner.nextLine();
    Train train = new Train(name);
    boolean hasEngine = false; 

    while (!hasEngine) {
        System.out.println("Select car type for the engine:");
        System.out.println("1. TrainEngine");
        System.out.println("2. FreightCar");
        System.out.println("3. Caboose");
        int carType = Integer.parseInt(scanner.nextLine());

        if (carType == 1) {
            TrainEngine engine = TrainEngine.create();
            train.addCar(engine);
            hasEngine = true; 
        } else {
            System.out.println("Invalid car type selection. Please select a TrainEngine.");
        }
    }

    System.out.print("Enter the number of additional train cars: ");
    int numCars = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < numCars; i++) {
        System.out.println("Select car type for car " + (i + 1) + ":");
        System.out.println("1. TrainEngine");
        System.out.println("2. FreightCar");
        System.out.println("3. Caboose");
        int carType = Integer.parseInt(scanner.nextLine());

        if (carType == 1) {
            TrainEngine engine = TrainEngine.create();
            train.addCar(engine);
        } else if (carType == 2) {
            FreightCar freightCar = FreightCar.create();
            train.addCar(freightCar);
        } else if (carType == 3) {
            Caboose caboose = Caboose.create();
            train.addCar(caboose);
        } else {
            System.out.println("Invalid car type selection. Please try again.");
            i--; 
        }
    }

   return train; 
}

    public void addCar(TrainCar car) {
        cars.add(car);
    }

    public void applyBrake(double brakeStrength) {
        System.out.println("Applying brakes to all train cars:");
        for (TrainCar car : cars) {
            car.brake(brakeStrength);
            System.out.println(car.toString());
        }
    }

    public double getMaxAccel() {
        int totalWeight = 0;
        for (TrainCar car : cars) {
            totalWeight += car.getWeight();
        }

        double maxAccel = 0; 
        for (TrainCar car : cars) {
            if (car instanceof EngineLimits) {
                maxAccel =  ((EngineLimits) car).getMaxAccel(totalWeight);
            }
        }
        return maxAccel;
    }

    public double getMaxSpeed() {
        double maxSpeed = 0.0;
        for (TrainCar car : cars) {
            if (car instanceof EngineLimits) {
                maxSpeed = Math.max(maxSpeed, ((EngineLimits) car).getMaxSpeed());
            }
        }
        return maxSpeed;
    }
}