package come.Class17;

public class Car {
	
	//Template/blueprint USED to create objects
	//define attributes/features -->variables  for objects we will be creating
	
	String make, model,color;
	int year, wheels, windows,speed;
	
	
	//adding behavior/action -->methods();
	
	void drive() {//method being called
		System.out.println("Car "+make+ " can drive");
	}
	
	void start() {
		System.out.println("I am start method");
		System.out.println("Car "+make+" can start");
	}
	
	void accelerate() {
		System.out.println("Car "+make+ " can accelerate");
	}
	
	

}
