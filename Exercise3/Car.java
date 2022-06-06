public class Car {
    
    private int yearModel;
    private String make;
    private int speed;

    public Car() {
        
    }

    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    public int getYearModel() {
        return this.yearModel;
    }

    public String getMake() {
        return this.make;
    }

    public int getSpeed(){
        return speed;
    }

    public int accelerate() {
        return speed += 5;
    }

    public int brake(){
        if (speed > 0) {
            return speed -= 5;
        } else {
            return speed = 0;
        }
        
    }

    
    public static void main (String [] args) {

        Car car1 = new Car(2019, "Toyota");
        for (int i = 1; i < 6; i++) {
            car1.accelerate();
            System.out.println("Speed after accelerate " + i + " time = " + car1.getSpeed());
        }

        for (int i = 1; i < 6; i++) {
            car1.brake();
            System.out.println("Speed after break " + i + " time = " + car1.getSpeed());
        }
    }
}
