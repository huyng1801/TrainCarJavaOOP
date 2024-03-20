package com;

/**
 * The TrainCar class represents a train car that can be coupled to other train cars.
 * It implements the Coupler interface to provide the ability to apply brakes.
 */
public class TrainCar implements Coupler {
    private String name;
    private int weight;
    private int wheels;

    /**
     * Constructs a TrainCar object with the specified name, weight, and number of wheels.
     *
     * @param name   The name of the train car.
     * @param weight The weight of the train car.
     * @param wheels The number of wheels on the train car.
     */
    protected TrainCar(String name, int weight, int wheels) {
        this.name = name;
        this.weight = weight;
        this.wheels = wheels;
    }

    /**
     * Retrieves the name of the train car.
     *
     * @return The name of the train car.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the weight of the train car.
     *
     * @return The weight of the train car.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Retrieves the number of wheels on the train car.
     *
     * @return The number of wheels on the train car.
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Applies the brake to the train car with the specified strength.
     * The strength parameter determines the degree of braking.
     *
     * @param strength The strength of the brake. A higher value indicates stronger braking.
     */
    @Override
    public void brake(double strength) {
        System.out.println("Applying brakes to Train Car: " + getName());
    }

    /**
     * Returns a string representation of the TrainCar object.
     *
     * @return A string representation of the TrainCar object.
     */
    @Override
    public String toString() {
        return "TrainCar{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", wheels=" + wheels +
                '}';
    } 
}