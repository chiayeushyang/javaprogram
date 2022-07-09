import javax.xml.bind.ValidationEvent;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import javafx.scene.CacheHint;

public abstract class Vehicle {
    private String brandName;
    public String modelName; 
    public int i;
    
    public void brake() {
        //implementation code 
    }
     
    public abstract void horn(); //abstract inside method force subclass to overide the method
    public abstract void accelerate();




    public static void main(String[] args) {
        // Vehicle veh = new Vehicle(); //abstract class cannot create bject 
        Car car1 = new Car();
        car1.horn();
        // Truck t1 = new Truck();
    }
}

class Car extends Vehicle {
    public void horn() {
        System.out.println("pii pii");
    }; 

    public void accelerate() {
        i++;
    }
}

class Truck extends Vehicle {
    public void horn() {
        System.out.println("tuut tuut");
    }; 
    
    public void accelerate() {
        i++;
    }
}

// abstract class Truck extends Vehicle {

// }