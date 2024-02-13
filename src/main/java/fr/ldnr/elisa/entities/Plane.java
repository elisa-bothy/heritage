/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.entities;

/**
 *
 * @author Elisa Bothy
 */
public class Plane extends Vehicle {
    
    private int capacity;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plane{");
        sb.append("capacity=").append(capacity);
        sb.append('}');
        return sb.toString();
    }
       

    @Override
    public void stop() {
        System.out.println("J'arrête le moteur de l'avion !");
    }

    @Override
    public void start() {
        System.out.println("Je démarre le moteur de l'avion !");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}

