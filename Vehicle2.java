public class Vehicle2{
    private double cost;
    
    public Vehicle2(double c){
           cost = c;
    }

    public static void main(String[] args) {
        Car car1 = new Car(20.00, 6);
    }
}

// Subclass
class Car extends Vehicle2{
		
		private int passengers;

public Car(double c, int p){
        super(c);
    	passengers =p;
    }
}
