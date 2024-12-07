package chapter10;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		empId = 100;
		name = "Amar";
		salary = 200.0;
	}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(Employee e) {
		
//		if(this.empId>e.empId) {
//			return 1;
//		}else if(this.empId<e.empId) {
//			return -1;
//		}
//		return 0;
		
		
		if(this.name.length()>e.name.length()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	
	
	
}
