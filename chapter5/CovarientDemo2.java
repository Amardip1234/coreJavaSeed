package chapter5;

class emp2{
	int eid;
	public emp2() {
		eid = 101;
	}
	public emp2 printEmp(){
		return new emp2();
	}
	@Override
	public String toString() {
		return "emp1 [eid=" + eid + "]";
	}
	
}

class mngr1 extends emp2{
	String name;
	public mngr1() {
		super();
		name = "abc";
	}
	public mngr1 printEmp() {
		return new mngr1();
	}
	
	public void display() {
		System.out.println(super.eid+" "+name);
	}
}
public class CovarientDemo2 {

	public static void main(String[] args) {
		emp2 e = new emp2();
		e.printEmp();
		mngr1 m = new mngr1();
		System.out.println(m.printEmp());
		m.display();
		

	}

}
