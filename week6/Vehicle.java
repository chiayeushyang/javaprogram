import javafx.scene.effect.SepiaTone;

public class Vehicle {
    
    protected String brandName; // can access by subclass
    private String modelName;
    protected int speed;

   Vehicle () {
        System.out.println("Superclass constructor is called");
    }

    Vehicle (String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
    }

    public void brake () {
        System.out.println("brake is pressed");
        speed--;
    }
    public void accelarate () {
        speed++;
    }

    //public final void horn () {} //with final subclass cannot override the method
    public void horn () {
        System.out.println("Beep beep");
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla" , "W1");
        car1.horn();
        // car1.setBrandName("Tesla");
        System.out.println("Car Brand = " + car1.getBrandName());
       // String brand = car1.brandName; //cannot access because it is private 
       Car car2 = new Car();
       System.out.println("Car Brand = " + car2.getBrandName());
       Truck truck1 = new Truck();
       truck1.horn(); truck1.setBrandName("Tesllllllllllllllllllllla");
       System.out.println("Truck Brand = " + truck1.getBrandName());
    }
 }

 class Car extends Vehicle{
    int gear;
    Car (String brandName, String modelName) {
        //System.out.println("super() must be the first line");
        // super(brandName, modelName);
        System.out.println("Noooooo");
    }

    Car() {

    }
        
    public void horn() {//override superclass method
            System.out.println("Tut tut");
            super.horn();
        }
    public void accelarate () {
        speed+=10;
    }
 }

 class Truck extends Vehicle {
    public void horn () {
        System.out.println("Beep.............beep");
    }
    public void accelarate () {
        speed+=5;
    }
 }

