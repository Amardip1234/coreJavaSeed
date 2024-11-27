package Chapter3;


class demo{
	 int age = 0;
	
	demo(){
		age++;
	}
}
public class fundamentals {
	

	public static void main(String[] args) {
		demo d = new demo();
		demo d1 = new demo();
		System.out.println(d.age);
	}

}
