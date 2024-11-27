package chapter8;

public class ThrowD {

	public static void main(String[] args) throws InvalidAgeException {
		int age  = 5;
		if(age<18) {
			throw new InvalidAgeException("not eligible");
		}else {
			System.out.println("eigible");
		}

	}

}
