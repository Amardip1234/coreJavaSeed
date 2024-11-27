package Chapter4;

class emplyees{
	private int eid;
	private String name;
	private Mydate date;
	
	public emplyees() {
		eid = 1;
		name = "Amar";
		date = new Mydate();
	}

	public emplyees(int eid, String name, Mydate date) {
		this.eid = eid;
		this.name = name;
		this.date = date;
	}
	public void print() {
		System.out.println(eid+"/"+name+"/"+date);
	}
	
}
public class Employee {

	public static void main(String[] args) {
		emplyees e1 = new emplyees();
		emplyees e2 = new emplyees();
		e2.print();
		emplyees e3 = new emplyees(1,"Adi",new Mydate(22,22,2022));
		e3.print();
	}

}
