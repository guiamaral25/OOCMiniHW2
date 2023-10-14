/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Guilherme Amaral - 2022262
 */

 
 //implement of a sailboat, extends vehicle an d implements sailable 
public class Sailboat extends Vehicle implements Sailable {
    private String make;
    private String type;
    private boolean sailHoisted;

    public Sailboat(String make, String type) {
        this.make = make;
        this.type = type;
    }

    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    @Override
    public void landHo() {
        // Implement landing ho logic for a sailboat
    }

}
