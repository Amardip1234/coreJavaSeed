package Inheritance;

class Person{
	int id;
	String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
class emp1 extends Person{
	float salary;
	public emp1(int id, String name, float salary) {
		super(id,name);
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id+" "+name+" has a salary "+salary);
		System.out.println(super.name);
		System.out.println(super.id);
	}
}
public class superkeyword2 {

	public static void main(String[] args) {
		emp1 e  = new emp1(1, "Amar", 25000);
		e.display();

	}

}
