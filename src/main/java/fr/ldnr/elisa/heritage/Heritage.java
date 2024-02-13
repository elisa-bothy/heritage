/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.ldnr.elisa.heritage;

import fr.ldnr.elisa.entities.Boat;
import fr.ldnr.elisa.entities.Car;
import fr.ldnr.elisa.entities.Plane;

/**
 *
 * @author Elisa Bothy
 */
public class Heritage {

    public static void main(String[] args) {
        Car alpha = new Car();
        alpha.start();
        alpha.stop();
        alpha.accelerate(25.6);
        System.out.println("alpha = " + alpha);
        alpha.slowDown(15);
        System.out.println("alpha = " + alpha);
        Plane plane = new Plane();
        plane.start();
        plane.stop();
        Boat boat = new Boat();
        boat.start();
        boat.stop();
    }
}
