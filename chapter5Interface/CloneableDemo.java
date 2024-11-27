package chapter5Interface;

class CloneDemo implements Cloneable{
	private int a,b;

	public CloneDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Object clone() throws CloneNotSupportedException{
		CloneDemo c = new CloneDemo(this.a, this.b);
		return c;
	}

	@Override
	public String toString() {
		return "CloneDmeo [a=" + a + ", b=" + b + "]";
	}
	
	
}
public class CloneableDemo {

	public static void main(String[] args) {
		try {
			CloneDemo c = new CloneDemo(5, 4);
			CloneDemo c1 = (CloneDemo)c.clone();
			
			System.out.println(c);
			System.out.println(c1);
		}catch (CloneNotSupportedException e) {
			System.out.println("Not found");
		}
		
		
		
	}
		
		
		

}


