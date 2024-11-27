package Inheritance;

public class Puppy extends Dog {

	public void walk() {
		System.out.println("Waling..");
	}
	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.walk();
		p.bark();
		p.sleep();

	}

}
