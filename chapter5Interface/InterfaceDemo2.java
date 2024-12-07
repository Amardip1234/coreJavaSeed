package chapter5Interface;

interface Prints{
	void print();
	default void print2() {
		System.out.println("Print from interface");
	}
	
	static void display() {
		System.out.println("Static method call from interface");
	}
}


class emp implements Prints{
		int eid = 101;
		String name = "Amar";
		
	 public void print() {
		System.out.println("Employee Detqails: "+eid+ " "+name );
	}
	
}

class ReatShape implements Prints{
	private int l = 5, b = 4;
	public int area() {
		return l*b;
	}
	public void print() {
		System.out.println("Area of rectangle is :"+area());
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		ReatShape r = new ReatShape();
		r.print();
		emp e = new emp();
		e.print();
		e.print2();
		Prints.display();
		
	}

}
