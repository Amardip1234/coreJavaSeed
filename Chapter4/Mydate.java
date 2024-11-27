package Chapter4;

public class Mydate {
	private int dd;
	private int mm;
	private int yy;
	
	Mydate(){
		dd = 11;
		mm = 11;
		yy = 2024;
	}

	
	public Mydate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}


	@Override
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
	
}
