public class Vehicle {
    
    private String brandName;
    private String modelName;
    private int speed;

    public void brake () {
        System.out.println("brake is pressed");
        speed--;
    }
    public void accelarate () {
        speed++;
    }
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
        Car car1 = new Car();
        car1.horn();
        car1.setBrandName("Tesla");
        System.out.println("Car Brand = " + car1.getBrandName());
       // String brand = car1.brandName; //cannot access because it is private 
    }
 }

 class Car extends Vehicle{
//class Car extends Vehicle {
 }


