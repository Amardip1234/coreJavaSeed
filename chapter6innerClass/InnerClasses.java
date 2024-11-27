package chapter6innerClass;

class Outer1{
	private int a= 10;
	public void display() {
		System.out.println(a);
	}
	
	class inner1{
		private int b = 20;
		public void display() {
			System.out.println(b);
		}
	}
}
public class InnerClasses {

	public static void main(String[] args) {
		Outer1 o  = new Outer1();
		Outer1.inner1 i = o.new inner1();
		o.display();
		i.display();

	}

}
