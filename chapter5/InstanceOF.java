package chapter5;

class Parent1{
	Parent1() {
		System.out.println("Hello from parent");
	}
}

class Child1 extends Parent1{
	public Child1() {
		super();
	}
}
public class InstanceOF {

	public static void main(String[] args) {
//		Parent1 p = new Parent1();
//		
//		if(p instanceof Parent1) {
//			System.out.println(true);
//		}
//		
//		Parent1 p1 = new Child1();
//		if(p1 instanceof Child1 ) {
//			System.out.println(true);
//		}
		
		Child1 c1 = null;
		if(c1 instanceof Child1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		Child1 c = new Child1();
		
	}

}
