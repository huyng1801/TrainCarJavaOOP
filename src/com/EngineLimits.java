package com;

/**
 * The EngineLimits interface represents the limits and capabilities of an engine.
 * Objects that implement this interface provide methods to retrieve the maximum acceleration
 * and maximum speed that the engine can achieve.
 */
public interface EngineLimits {
    
    /**
     * Retrieves the maximum acceleration that the engine can achieve for a given weight.
     *
     * @param weight The weight for which the maximum acceleration is calculated.
     * @return The maximum acceleration of the engine for the specified weight.
     */
    public double getMaxAccel(double weight);
    
    /**
     * Retrieves the maximum speed that the engine can achieve.
     *
     * @return The maximum speed of the engine.
     */
    public double getMaxSpeed();
}