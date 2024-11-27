package chapter5;

public class ManagerNew extends EmployeeNew{
	float incentive;
	public ManagerNew() {
		incentive = 1000;
	}
	ManagerNew(float incen){
		incentive = incen;
	}
	public double calculateIncentive() {
		return super.calculateSalary() + incentive;
	}

	public void displayIncentive() {
		System.out.println("Incentive :" + incentive);
	}
}
