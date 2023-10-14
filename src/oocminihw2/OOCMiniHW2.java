/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a instrance of the car
          Car myCar = new Car("Toyota", "Sedan");
        myCar.accelerate(60);
        System.out.println("Car Speed: " + myCar.getSpeed());
         
         //create a instance of the airplane class
        Airplane myAirplane = new Airplane("Boeing", "747");
        myAirplane.changeAltitude(10000);
        System.out.println("Airplane Altitude: " + myAirplane.getAltitude());

        //create a instance of the sailboat class
        Sailboat mySailboat = new Sailboat("Beneteau", "Oceanis");
        mySailboat.hoistSail();
        System.out.println("Is Sail Hoisted? " + mySailboat.isSailHoisted());
    }
}
    
    

