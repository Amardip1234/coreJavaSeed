package Inheritance;

class Animals{
	public void sleep() {
		System.out.println("Sleeping..");
	}
}
class Tiger extends Animals{
	public void sound() {
		System.out.println("Roaring..");
	}
}

class Cat extends Animals{
	public void drink() {
		System.out.println("Drinking..");
	}
}
class BabyTiger extends Tiger{
	public void walk() {
		System.out.println("walking..");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		BabyTiger b1 = new BabyTiger();
		Cat c1 = new Cat();
		b1.walk();
		b1.sound();
		b1.sleep();
		c1.drink();
		c1.sleep();

	}

}
