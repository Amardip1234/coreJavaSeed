package Lab_manual;

public class Employee {
	static int empId;
	int date_of_joining;
	String name;
	float base_salary;
	static int count;
	
	public Employee() {
		empId++;
	}
	
	static void totalEmployees() {
		System.out.println(empId);
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", base_salary=" + base_salary + "]";
	}

	public static void main(String []args) {
		
		Employee e1 = new Employee();
		e1.totalEmployees();
		Employee e2 = new Employee();
		e2.totalEmployees();
		Employee e3 = new Employee();
		e3.totalEmployees();
	}
}
