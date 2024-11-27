package introduction;

class mydate{
	private int day = 24;
	private int month = 04;
	private int year = 2001;
	
	public void printdate() {
		System.out.println("Birth date is "+ day+"/"+month+"/"+year);
	}
}

public class hello {
	
		private int day = 24;
		private int month = 04;
		private int year = 2001;
	
	public void change(int day) {
		this.day = day;
	}
	public void print() {
		System.out.println(day);
	}
	public int add(int a, int b) {
		return a+b;
	}
	public float add(float a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		hello h1 = new hello();
		h1.change(222);
		h1.print();

	}

}
