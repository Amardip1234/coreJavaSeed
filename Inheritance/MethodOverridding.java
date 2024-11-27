package Inheritance;

class vehicle{
	 void run() {
		System.out.println("Vehicle is Running..");
	}
}
class Car extends vehicle{
	 void run() {
		System.out.println("Car is running");
	}
}
public class MethodOverridding {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.run();
		vehicle v = new vehicle();
		v.run();

	}
}
