/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.entities;

/**
 *
 * @author Elisa Bothy
 */
public class Car extends Vehicle {

    @Override
    public void stop() {
        System.out.println("J'arrête le moteur de la voiture !");
    }

    @Override
    public void start() {
        System.out.println("Je démarre le moteur de la voiture !");
    }
    
}
