package chapter10Method_reference;

interface Sayable{
	public void say();
}
public class nonStaticMethodRef {
	public void say1() {
		System.out.println("Hello from non static method");
	}
	public static void main(String[] args) {
		nonStaticMethodRef n = new nonStaticMethodRef();
		
		Sayable s = n::say1;
		s.say();

	}

}
