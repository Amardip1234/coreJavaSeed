package chapter10Method_reference;

interface Printable{
	emp1 getDetails(int eid, String name);
}

class emp1{
	int eid;
	String name;
	public emp1(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "emp1 [eid=" + eid + ", name=" + name + "]";
	}
	
	public void display()
	{	
		System.out.println("Eid "+eid+" name :"+name);
	}
}
public class ConstructorMethodRef {

	public static void main(String[] args) {
		Printable p = emp1::new;
		p.getDetails(101, "Amar").display();
		
	}

}
