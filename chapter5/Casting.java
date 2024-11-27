package chapter5;

class Parent{
	String name;
	void parentPrint() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int id;
	void childPrint() {
		System.out.println("Child Method");
	}
}
public class Casting {

	public static void main(String[] args) {
		Child c = new Child();
		c.childPrint();
		c.parentPrint();
		
		Parent p = new Parent();
		p.parentPrint();
		
		Parent P1 = new Child(); //upcasting
		P1.parentPrint();
		
		Child C1 = (Child)P1;	//downcasting
		C1.parentPrint();
		C1.childPrint();
		
		
		if(P1 instanceof Child) {
			System.out.println(true);
		}
		
		
	}

}
