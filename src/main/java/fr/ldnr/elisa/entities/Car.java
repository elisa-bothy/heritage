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
public class Car extends MotorizedVehicle {
    private int power;
    private Color color;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{")
            .append("speed=").append(speed)
            .append("power=").append(power)
            .append(", color=").append(color)
            .append('}');
        return sb.toString();
    }
    

    @Override
    public void stop() {
        System.out.println("J'arrête le moteur de la voiture !");
    }

    @Override
    public void start() {
        System.out.println("Je démarre le moteur de la voiture !");
    }

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
