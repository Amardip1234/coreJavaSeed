
package chapter5Abstraction;

abstract class shape{
	public abstract void area();
	
	public void print() {
		System.out.println("Hello");
	}

}

class cicle extends shape{
	private double pi = 3.14;
	private int r = 3;
	private double res;
	public void area() {
		res = pi * r*r;
		System.out.println("Area of Cicle "+res);
	}
}

class rect extends shape{
	private int l;
	private int b;
	
	rect(int l, int b){
		this.l = l;
		this.b = b;
	}
	public void area() {
		System.out.println("Area of rectangle"+l*b);
	}
}

public class MyShapeAbstraction {


	public static void main(String[] args) {
			
		cicle c = new cicle();
		c.area();
		rect r = new rect(5, 4);
		r.area();
		r.print();
		shape c1 = new cicle();
		c1.area();
	}

}
