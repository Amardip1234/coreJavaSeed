package Inheritance;

class Developer extends Manager{
	private int devSalary;
	
	public Developer() {
		devSalary = salary;
	}
	public int calDevSal() {
		return devSalary*12+incentive;
	}
}

public class Manager extends Employee{
	protected int incentive;
	
	Manager(){
		incentive = 500;
	}
	
	public int calculatesalary() {
		return salary*12+incentive+5000;
	}
	
	
	
	public static void main(String[] args) {
		Manager m = new Manager();
		System.out.println(m.calculateSal());
		System.out.println("Manager salary :"+m.calculatesalary());
		Developer d = new Developer();
		System.out.println("Developer salary :"+d.calDevSal());
	}
}


