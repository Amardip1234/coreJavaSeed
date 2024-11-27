package Inheritance;

class Animal2{
	
	String name;
	
	Animal2(String name){
		this.name = name;
		System.out.println("Animal constructor invoked");
	}
	public Animal2() {
		// TODO Auto-generated constructor stub
	}
	void sound() {
		System.out.println("Animal makes sound");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}	
}

class Dog2  extends Animal2{
	String breed;
	
	Dog2(String name, String breed){
//		super(name);
		this.breed = breed;
		System.out.println("Dog constructor called");
	}
	
	void sound() {
		super.sound();
		System.out.println("Dog barks");
	}
	public void display() {
		System.out.println("Name: "+ super.name);
		System.out.println(breed);
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
}
public class superKeyword {

	public static void main(String[] args) {
		Dog2 d = new Dog2("Dog", "Pumerian");
		
		
		d.display();
		d.sound();
		Animal2 a = new Animal2();
		a.sleep();
		d.sleep();
;
	}

}
