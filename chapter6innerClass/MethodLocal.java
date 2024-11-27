package chapter6innerClass;

class OuterLocal{
	private int i = 10;
	public void show() {
		final int k = 30;
		
		class InnerLocal{
			private int j = 20;
			public void print() {
				System.out.println("InnerLocal j="+j);
				System.out.println("MethodLocal k="+k);
				System.out.println("Outer i="+i);
			}
		}
		
		InnerLocal l = new InnerLocal();
		l.print();
	}
}
public class MethodLocal {

	public static void main(String[] args) {
		OuterLocal l = new OuterLocal();
		l.show();
		

	}

}
