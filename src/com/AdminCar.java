package com;

/**
 * The AdminCar class represents an administrative car that extends the TrainCar class.
 * It adds a totalStaff field to represent the total number of staff members in the car.
 */
public class AdminCar extends TrainCar {
    private int totalStaff;

    /**
     * Constructs an AdminCar object with the specified name, weight, wheels, and total staff.
     *
     * @param name       The name of the administrative car.
     * @param weight     The weight of the administrative car.
     * @param wheels     The number of wheels on the administrative car.
     * @param totalStaff The total number of staff members in the administrative car.
     */
    public AdminCar(String name, int weight, int wheels, int totalStaff) {
        super(name, weight, wheels);
        this.totalStaff = totalStaff;
    }

    /**
     * Returns a string representation of the AdminCar object.
     *
     * @return A string representation of the AdminCar object.
     */
    @Override
    public String toString() {
        return "AdminCar{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", wheels=" + getWheels() +
                ", totalStaff=" + totalStaff +
                '}';
    }
}