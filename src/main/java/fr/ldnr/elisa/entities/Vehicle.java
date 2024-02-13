/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.entities;

import java.awt.Color;

/**
 *
 * @author Elisa Bothy
 */
public abstract class Vehicle {
    private int power;
    private Color color;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{");
        sb.append("power=").append(power);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

      
    /**
     * Pour arrêter le véhicule
     */
    public abstract void stop();
    /**
     * Pour démarrer le véhicule
     */
    public abstract void start();

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
