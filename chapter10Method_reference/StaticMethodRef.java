package chapter10Method_reference;


interface Sayable{
	public void say();
}
public class StaticMethodRef {
	public static void say1() {
		System.out.println("Hello this is from static method reference");
	}
	public static void main(String[] args) {
		Sayable s = StaticMethodRef::say1;

		s.say();
	}

}
