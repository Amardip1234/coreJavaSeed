package chapter10;

import java.util.ArrayList;
import java.util.Collections;

public class CompareEmployeeId {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList();
		empList.add(new Employee(111,"Amardip",1050.0));
		empList.add(new Employee(102,"Bnish",2400.0));
		empList.add(new Employee(250,"Tejas",750.0));
		empList.add(new Employee(221,"Aditya",1000.0));
		empList.add(new Employee(221,"Anu",1000.0));
		
//		System.out.println("Before_update");
//		
//		for(Employee e:empList) {
//			System.out.println(e);
//		}
//		
//		Collections.sort(empList);
//		
//		System.out.println("\n after update");
//		
//		for(Employee e:empList) {
//			System.out.println(e);
//		}
		
		
		//comparator according to ID
		
//		Collections.sort(empList,new CompareEmployeeId_Comparator());
		Collections.sort(empList,new CompareTOName());
		System.out.println("\n After sorting according to id");
		for(Employee e: empList) {
			System.out.println(e);
		}
		
	}

}
