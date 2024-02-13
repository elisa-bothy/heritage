/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.entities;

import interfaces.Startable;
import interfaces.Stoppable;

/**
 *
 * @author Elisa Bothy
 */
public abstract class MotorizedVehicle extends Vehicle implements Startable, Stoppable  {

    @Override
    public void start() {
        System.out.println("Le véhicule démarre ! ");
    }

    @Override
    public void stop() {
        System.out.println("Le véhicule s'arrête ! ");
    }
     
}
