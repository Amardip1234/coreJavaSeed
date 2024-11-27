package chapter8;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				int b = 22/0;
				System.out.println(b);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				int arr[] = {1,2,3,4};
				System.out.println(arr[4]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Another syso");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("outer msg");
	}

}
