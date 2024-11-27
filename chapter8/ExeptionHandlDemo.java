package chapter8;
import java.util.*;
public class ExeptionHandlDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println(a);
//		System.out.println(a/0);
		try {
			int res = a/0;
			System.out.println(res);
			int ar[] = {1,2,3,4};
			System.out.println(ar[5]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		System.out.println("Hello");
		
		
	}

}
