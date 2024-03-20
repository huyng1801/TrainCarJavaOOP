package com;

import java.util.Scanner;

/**
 * The FreightCar class represents a freight car that extends the TrainCar class.
 * It adds a type field and provides a method to create a new FreightCar object
 * by prompting the user for input.
 */
public class FreightCar extends TrainCar {

    private String type;

    /**
     * Constructs a FreightCar object with the specified name, weight, wheels, and type.
     *
     * @param name   The name of the freight car.
     * @param weight The weight of the freight car.
     * @param wheels The number of wheels on the freight car.
     * @param type   The type of the freight car.
     */
    private FreightCar(String name, int weight, int wheels, String type) {
        super(name, weight, wheels);
        this.type = type;
    }

    /**
     * Creates a new FreightCar object by prompting the user for input.
     *
     * @return A new FreightCar object with user-specified details.
     */
    public static FreightCar create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Freight Car details:");
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the weight (in tonnes): ");
        int weight = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of wheels: ");
        int wheels = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the type: ");
        String type = scanner.nextLine();
        return new FreightCar(name, weight, wheels, type);
    }

    /**
     * Returns a string representation of the FreightCar object.
     *
     * @return A string representation of the FreightCar object.
     */
    @Override
    public String toString() {
        return "FreightCar{"
                + "name='" + getName() + '\''
                + ", weight=" + getWeight()
                + ", wheels=" + getWheels()
                + ", type='" + type + '\''
                + '}';
    }
}