
public class Bike extends Vehicle {
	void run(){
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		Vehicle obj =  new Vehicle();
		Bike obj1 =  new Bike();
		
		obj.run();
		obj1.run();

	}

}
