package chapter7;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a = 20;
		Integer b = new Integer(a);
		System.out.println(b); 				//autoboxing
		
		int c = b.intValue();				//auto unboxing
		System.out.println(c);
		
		int d = 30;							//autoboxing
		Integer e = d;
		System.out.println(e);
		
		int f = e;							//auto unboxing
		System.out.println(f);

	}

}
