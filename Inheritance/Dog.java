package Inheritance;



public class Dog extends Animal{
	
	public void bark() {
		System.out.println("Barking..");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.sleep();

	}

}
