package fileIO;

import java.io.Serializable;

public class Emp_Serialization implements Serializable{
	private int empId;
	private String name;
	private double salary;
	public Emp_Serialization() {
		empId = 102;
		name = "Amar";
		salary = 100000;
	}
	public Emp_Serialization(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp_Serialization [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
