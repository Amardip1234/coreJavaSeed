package chapter7;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Seed";
		String s1 = "Squad";
		System.out.println(s.length());
		System.out.println(s.replace('e', 'd'));
		System.out.println(s.replaceAll("ed", "aa"));
		System.out.println(s.concat(",Thane"));
		System.out.println(s.isEmpty());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(1, 3));
		System.out.println(s.equals(s1));
		
		System.out.println(s);
	}

}
