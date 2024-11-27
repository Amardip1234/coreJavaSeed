package Lab_manual;

public class Date {
	private int day;
	private int mon;
	private int yy;
	
	Date(){
		day = 11;
		mon = 7;
		yy = 2024;
	}
	Date(int d, int m, int y){
		this.day = d;
		this.mon = m;
		this.yy = y;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", mon=" + mon + ", yy=" + yy + "]";
	}
	

	public static void main(String[] args) {
		Date d = new Date();
		Date d1 = new Date(2,3,2023);
		System.out.println(d1);
	}

}
