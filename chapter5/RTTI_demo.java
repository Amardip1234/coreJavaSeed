package chapter5;

public class RTTI_demo {
	public static void displaySalary(EmployeeNew e) {
		double sal = e.calculateSalary();
		if(e instanceof ManagerNew) {
			double incen = ((ManagerNew)e).calculateIncentive();
			System.out.println("Manager salary "+sal+ " adding Inentive "+incen);
		}
	}

	public static void main(String[] args) {
		ManagerNew m = new ManagerNew(2000);
		displaySalary(m);


	}

}
