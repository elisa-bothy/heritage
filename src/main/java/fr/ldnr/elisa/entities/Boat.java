/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ldnr.elisa.entities;

/**
 *
 * @author Elisa Bothy
 */
public class Boat extends Vehicle {
    
    private int tonnage;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Boat{");
        sb.append("tonnage=").append(tonnage);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void stop() {
        System.out.println("J'arrête le moteur du bateau !");
    }

    @Override
    public void start() {
        System.out.println("Je démarre le moteur du bateau !");
    }

    public int getTonage() {
        return tonnage;
    }

    public void setTonage(int tonage) {
        this.tonnage = tonage;
    }
    
}
