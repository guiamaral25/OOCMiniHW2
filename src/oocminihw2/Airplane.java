/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Guilherme Amaral 2022262
 */

    //implement of a airplane, extends vehicle and implements flyable
public class Airplane extends Vehicle implements Flyable {
    private String make;
    private String type;
    private float altitude;

    public Airplane(String make, String type) {
        this.make = make;
        this.type = type;
    }

    @Override
    public void accelerate(float speed) {
        this.speed += speed;
    }

    @Override
    public void brake() {
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public void changeAltitude(float change) {
        this.altitude += change;
    }

    @Override
    public float getAltitude() {
        return altitude;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public float getDirection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


