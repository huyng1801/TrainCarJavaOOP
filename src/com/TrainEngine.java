package com;

import java.util.Scanner;

/**
 * The TrainEngine class represents a train engine that extends the AdminCar class and implements the EngineLimits interface.
 * It adds a description and power field to represent the engine's description and power in kilowatts.
 * The class provides a method to create a new TrainEngine object by prompting the user for input.
 */
public class TrainEngine extends AdminCar implements EngineLimits {

    private String description;
    private int power;

    /**
     * Constructs a TrainEngine object with the specified name, description, weight, wheels, power, and total staff.
     *
     * @param name        The name of the train engine.
     * @param description The description of the train engine.
     * @param weight      The weight of the train engine.
     * @param wheels      The number of wheels on the train engine.
     * @param power       The power of the train engine in kilowatts.
     * @param totalStaff  The total number of staff members in the train engine.
     */
    private TrainEngine(String name, String description, int weight, int wheels, int power, int totalStaff) {
        super(name, weight, wheels, totalStaff);
        this.description = description;
        this.power = power;
    }

    /**
     * Creates a new TrainEngine object by prompting the user for input.
     *
     * @return A new TrainEngine object with user-specified details.
     */
    public static TrainEngine create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Train Engine details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Weight (in tonnes): ");
        int weight = Integer.parseInt(scanner.nextLine());
        weight = Math.max(100, Math.min(weight, 250));
        System.out.print("Number of Wheels: ");
        int wheels = Integer.parseInt(scanner.nextLine());
        System.out.print("Power (in kW): ");
        int power = Integer.parseInt(scanner.nextLine());
        power = Math.max(600, Math.min(power, 3000));
        System.out.print("Total Staff: ");
        int totalStaff = Integer.parseInt(scanner.nextLine());
        return new TrainEngine(name, description, weight, wheels, power, totalStaff);
    }

    /**
     * Returns the maximum acceleration of the train engine based on its power and weight.
     *
     * @param weight The weight of the train engine.
     * @return The maximum acceleration of the train engine.
     */
    @Override
    public double getMaxAccel(double weight) {
        return power / weight;
    }

    /**
     * Returns the maximum speed of the train engine.
     *
     * @return The maximum speed of the train engine.
     */
    @Override
    public double getMaxSpeed() {
        return 100.0;
    }

    /**
     * Returns the description of the train engine.
     *
     * @return The description of the train engine.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a string representation of the TrainEngine object.
     *
     * @return A string representation of the TrainEngine object.
     */
    @Override
    public String toString() {
        return "TrainEngine{"
                + "name='" + getName() + '\''
                + ", weight=" + getWeight()
                + ", wheels=" + getWheels()
                + ", powerKW=" + power
                + ", description=" + description
                + '}';
    }
}