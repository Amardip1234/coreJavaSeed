package chapter5;

public class EmployeeNew {
	private float basic;
	private double hra;
	private double da;
	
	public EmployeeNew() {
		basic = 1000;
		hra = 0.1*basic;
		da = 0.3* basic;
	}

	public EmployeeNew(float basic, double hra, double da) {
		super();
		this.basic = basic;
		this.hra = hra;
		this.da = da;
	}

	public double calculateSalary() {
		return basic+hra+da;
	}
	public void display() {
		
	}
	@Override
	public String toString() {
		return "EmployeeNew [basic=" + basic + ", hra=" + hra + ", da=" + da + "]";
	}
	
	
}
