package interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Elisa Bothy
 */
public interface SpeedChangeable {
    /**
     * Augmente
     * @param delta Le changement de vitesse >0
     */
    public abstract void accelerate (double delta);
    /**
     *  Baisse la vitesse
     * @param delta Le changement de vitesse >0
     */
    public abstract void slowDown (double delta);
}
