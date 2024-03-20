package com;

/**
 * The Coupler interface represents a mechanism for coupling or connecting objects.
 * Objects that implement this interface can be coupled or connected using the `brake` method.
 * The strength of the brake can be adjusted to control the degree of coupling.
 */
public interface Coupler {
    
    /**
     * Applies the brake to the coupler with the specified strength.
     * The strength parameter determines the degree of coupling or connection.
     *
     * @param strength The strength of the brake. A higher value indicates a stronger coupling.
     */
    public void brake(double strength);
}