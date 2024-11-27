package chapter7;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();
		
		s.append("hello");
		System.out.println(s);
		
		int l = s.length();
		System.out.println(l);
		
		s.append(" Welcome to seed");
		System.out.println(s);
		System.out.println(s.capacity());
		s.trimToSize();
		System.out.println(s.capacity());
	}
	
}
