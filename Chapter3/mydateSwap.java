package Chapter3;

class mydate{
	private int dd;
	private int mm;
	private int yy;
	
	public mydate(int d,int m,int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	
	public String toString() {
		return "mydate [dd "+dd +" mm "+mm+" yy "+yy+"]";
	}
	
//	public void print() {
//		System.out.println(dd+"/"+mm+"/"+yy);
//	}
	
}
public class mydateSwap {

	public static void swap(mydate m1,mydate m2) {
		mydate temp;
		temp = m1;
		m1 = m2;
		m2 = temp;
		
		System.out.println(m1);
		System.out.println(m2);
		
	}
	public static void main(String[] args) {
		mydate m1 = new mydate(11, 1, 2023);
		mydate m2 = new mydate(22, 2, 2024);
		
		System.out.println("before swap");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("after swap");
		mydateSwap.swap(m1, m2);
		
		
		
	}

}
