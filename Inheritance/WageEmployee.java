package Inheritance;

public class WageEmployee extends Employee{
	int hours;
	float rate;
	int bonus;
	
	WageEmployee() {
		bonus = 500;
	}
	WageEmployee(int hours,float rate){
		this.hours = hours;
		this.rate = rate;
	}
	
	public double calculateSal() {
		return super.salary*hours + bonus;
	}
	public static void main(String[] args) {
		WageEmployee e1 = new WageEmployee(90,2);
		System.out.println(e1.calculateSal());

	}

}
