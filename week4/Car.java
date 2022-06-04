public class Car {
    
    String make; // brand 
    String model;
    int year; 
    String color; 

    public Car () {
        make = "" ;
        model = "";
    }

    public Car (String make, String model) {
        this.make = make; 
        this.model = model;
    }

    public Car (String make, String model, int year) {
        this(make, model);
        this.year = year; 
    }

    public Car (String make, String model, int year, String color) {
        this(make, model, year);
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }


    public static void main(String [] args) {
        Car car1 = new Car();
        Car car2 = new Car("Honda", "City");
        Car car3 = new Car("Honda", "City", 2021);
        Car car4 = new Car("Honda", "City", 2021, "Blue");
        System.out.println("Make: " + car2.getMake() );
    }
}
