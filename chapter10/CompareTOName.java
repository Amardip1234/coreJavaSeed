package chapter10;

import java.util.Comparator;

public class CompareTOName implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		String empId1 = o1.getName();
		String empId2 = o2.getName();
		return empId1.compareTo(empId2);
	}
}
