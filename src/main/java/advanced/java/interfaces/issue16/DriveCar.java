package advanced.java.interfaces.issue16;

import advanced.java.access.modifiers.issue17.Vehicle;

public class DriveCar {
    public static void main(String[] args){

        Vehicle car = new Vehicle(4, 100.0);

        // Using methods from the interface Drivable
        System.out.println("Cars Max Speed: "+car.getSpeed());
        System.out.println("Cars Number of Wheels: "+car.getWheels());

        // Using methods from abstract method Crashable
        car.setCarStrength(10);
        System.out.println("Car Strength: "+car.getCarStrength());

    }

}
