/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.entities;

import interfaces.SpeedChangeable;

/**
 *
 * @author Elisa Bothy
 */
public abstract class Vehicle implements SpeedChangeable {   
    protected double speed;

    @Override
    public void accelerate(double delta) {
        if (delta>0){
            speed += delta;
        }
    }

    @Override
    public void slowDown(double delta) {
        if (delta>0 && delta <= speed){
            speed-=delta;
        }
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{")
            .append("speed=").append(speed)
            .append('}');
        return sb.toString();
    }
    
}
