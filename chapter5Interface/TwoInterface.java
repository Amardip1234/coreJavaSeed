package chapter5Interface;

interface area{
	int r = 3;
	double pi = 3.14;
	
	default void display() {
		double ar = pi*r*r;
		System.out.println("Area of cicle: "+ar);
	}
}
interface Employe{
	int eid = 101;
	double sal = 10000;
	
	static void display() {
		System.out.println("Id and salary of employe :"+eid + " "+sal);
	}
}
public class TwoInterface implements area,Employe{
	public void display() {
		area.super.display();
		Employe.display();
		
	}
	public static void main(String[] args) {
		TwoInterface t = new TwoInterface();
		t.display();

	}

}
