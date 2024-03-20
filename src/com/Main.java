package com;

public class Main {

    public static void main(String[] args) {
        Train t = Train.create();
        t.applyBrake(0.5);
        System.out.printf("Maxiumum Acceleration: $%.2f\n",
                t.getMaxAccel());
        if (t.getMaxAccel() < 0.1) {
            System.out.println("** Warning: Train is too heavy.");
        }

    }

}
