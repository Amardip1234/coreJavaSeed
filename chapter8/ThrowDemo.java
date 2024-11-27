package chapter8;

class Arithmetic{
	public void m1 (int divisor) throws ArithmeticException{
		
		if(divisor == 0) {
			int a = 10/divisor;
			System.out.println("Divisor : "+a);
		}
	}
}
public class ThrowDemo {

	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		try {
			a.m1(0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("...End...");
	}

}
