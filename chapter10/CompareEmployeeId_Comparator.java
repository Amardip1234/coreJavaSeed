package chapter10;

import java.util.Comparator;

public class CompareEmployeeId_Comparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer empId1 = o1.getEmpId();
		Integer empId2 = o2.getEmpId();
		return empId1.compareTo(empId2);
	}
}
