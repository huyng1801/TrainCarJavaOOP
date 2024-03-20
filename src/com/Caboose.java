package com;

import java.util.Scanner;

/**
 * The Caboose class represents a caboose that extends the AdminCar class.
 * It provides a method to create a new Caboose object by prompting the user for input.
 */
public class Caboose extends AdminCar {

    /**
     * Constructs a Caboose object with the specified name, weight, wheels, and total staff.
     *
     * @param name       The name of the caboose.
     * @param weight     The weight of the caboose.
     * @param wheels     The number of wheels on the caboose.
     * @param totalStaff The total number of staff members in the caboose.
     */
    private Caboose(String name, int weight, int wheels, int totalStaff) {
        super(name, weight, wheels, totalStaff);
    }

    /**
     * Creates a new Caboose object by prompting the user for input.
     *
     * @return A new Caboose object with user-specified details.
     */
    public static Caboose create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Caboose details:");
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the weight (in tonnes): ");
        int weight = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of wheels: ");
        int wheels = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of staff: ");
        int totalStaff = Integer.parseInt(scanner.nextLine());
        return new Caboose(name, weight, wheels, totalStaff);
    }

    /**
     * Returns a string representation of the Caboose object.
     *
     * @return A string representation of the Caboose object.
     */
    @Override
    public String toString() {
        return "Caboose{"
                + "name='" + getName() + '\''
                + ", weight=" + getWeight()
                + ", wheels=" + getWheels()
                + '}';
    }
}