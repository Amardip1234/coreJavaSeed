package chapter6innerClass;

class popcorn{
	public void test() {
		System.out.println("salty");
	}
}
public class AnonymousDemo {

	public static void main(String[] args) {
		popcorn p1 = new popcorn();
		p1.test();
		popcorn p = new popcorn() {
			public void test() {
				System.out.println("Spicy");
			}
		};
		
		p.test();

	}

}
