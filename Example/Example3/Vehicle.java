import javax.print.event.PrintJobAdapter;
import javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon;

import javafx.geometry.HorizontalDirection;

public abstract class Vehicle {

    private String brandName;
    private String modelName;

    public void brake() {
        //implementation code 
    }

    public abstract void horn() ;
    

    public static void main(String[] args) {
        //Vehicle veh = new Vehicle ();
        Bicycle bike1 = new Bicycle();
        Car car1 = new Car();
        Truck truk1 = new Truck();

        stopVehicle(car1);
        stopVehicle(truk1);
        horn(car1);
        horn(truk1);
        // horn(bike1);
        ring(bike1);

    }
    public static void stopVehicle (vehicleI vehI) { //using interface as reference type
        vehI.stop();
    }

    public static void horn(Vehicle veh) { //using abstract class as reference type
        veh.horn();
    }

    public static void ring(Bicycle bike) {
        bike.ring();
    }
        
}

class Bicycle{ //Bicycle is not a vehicle because didn't extend from vehicle
    public void ring() {
        System.out.println("ring.... ring...");
    }
}

class Car extends Vehicle implements vehicleI, 
                                     VehicleE {
    public void horn() {System.out.println("Beep beep");}
    public void stop() {System.out.println("Car Stopped");}
    public void start() {}
    public void chargable() {}
    public void autoDrive() {}
}

class Truck extends Vehicle implements vehicleI {
    public void horn() {System.out.println("Boooop boop");};
    public void start() {};
    public void stop() { System.out.println("Truck Stopped");};
}

interface vehicleI {
    public String carPlatNo = "";
    public void start();
    public void stop();
}

interface VehicleE {
    public void chargable();
    public void autoDrive();
}