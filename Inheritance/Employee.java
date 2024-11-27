package Inheritance;

public class Employee{
	private int eid;
	private String name;
	protected int salary;
	
	Employee(){
		salary = 1000;
	}
	
	
	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}


	public double calculateSal() {
		return salary*12;
	}

}
