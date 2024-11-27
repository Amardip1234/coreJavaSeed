package chapter5Interface;

interface Printable{
	void print();
}

class Employee implements Printable{
	 public void print() {
		System.out.println("printing from employee");
	}
}

class Reactangle implements Printable{
	public void print() {
		System.out.println("Printing from Reactangle");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {// TODO Auto-generated method stub
		Reactangle r = new Reactangle();
		r.print();
	}

}
