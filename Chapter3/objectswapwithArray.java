package Chapter3;

class mydate2{
	private int dd;
	private int mm;
	private int yy;
	
	public mydate2(int d,int m,int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	
	public String toString() {
		return "mydate [dd "+dd +" mm "+mm+" yy "+yy+"]";
	}
}

public class objectswapwithArray {

	public static void swap(mydate2[]arr) {
		mydate2 temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	public static void main(String[] args) {
		mydate2 dt[] = new mydate2[2];
		dt[0]=new mydate2(11, 1, 2023);
		dt[1]= new mydate2(22, 2, 2024);
		
		System.out.println("before swap");
		System.out.println(dt[0]);
		System.out.println(dt[1]);
		System.out.println("after swap");
		
		objectswapwithArray.swap(dt);
		System.out.println(dt[0]);
		System.out.println(dt[1]);
	}


}
