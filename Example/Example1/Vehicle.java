public class Vehicle {
	
	private String brandName;
	private String modelName;
	private int speed;
	
	
	Vehicle(String brandName, String modelName) {
		this.brandName = brandName;
		this.modelName = modelName;
	}
	
	Vehicle() {
		System.out.println("superClass Constructor");
	}

	public void brake() {
		speed--;
	}
	
	public void accelarate() {
		speed++;
	}
	public void horn() {
		System.out.println("Beep beep");
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName() {
		return brandName;
	}
	public static void main(String[] args) {
		Vehicle [] veh = new Vehicle[2];
		veh[0] = new Car ("honda", "city");
		veh[1] = new Truck();
		for (int i=0; i<veh.length; i++) {
			veh [i].horn();
		}
		
		Truck truck = new Truck();
		truck.pressBrake();
		// veh[1].pressBrake(); //cannot use method when only in subclass
	}
}
class Car extends Vehicle {

	Car (String brandName, String modelName) {
		super(brandName, modelName);
		System.out.println("subClass Constructor");
	}
	public void horn() {
		super.horn();
		System.out.println("tut tut");

	}
}

class Truck extends Vehicle {
	public void pressBrake() {

	}
}