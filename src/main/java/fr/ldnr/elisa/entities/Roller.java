/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.entities;

/**
 *
 * @author Elisa Bothy
 */
public class Roller extends MuscularVehicle {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Roller{")
            .append("speed=").append(speed)
            .append('}');
        return sb.toString();
    }
}
