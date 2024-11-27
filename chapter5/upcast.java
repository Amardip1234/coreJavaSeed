package chapter5;

class Animal
{
	public void eat()
	{
		System.out.println("eating ..");
	}
}

class Tiger extends Animal
{
//	public void eat()
//	{
//		System.out.println("Tiger eating ..");
//	}
	void walk() {
		System.out.println("Walking");
	}
}

public class upcast {

	public static void main(String[] args) {
//		Animal a= new Tiger();
//		Tiger t= (Tiger)a;
//		t.eat();
//		System.out.println("asdd");
		
		Animal a = new Tiger();
		Tiger t = (Tiger)a;
		t.walk();
		t.eat();
		
		
	}

}
