package chapter5;

class P1{
	public Number print() {
		return new Integer(50);
	}
}
class C1{
	public Double print() {
		return new Double(50.6);
	}
}

public class Covarient1 {

	public static void main(String[] args) {
		P1 p = new P1();
		System.out.println(p.print());
		C1 c = new C1();
		System.out.println(c.print());

	}

}
