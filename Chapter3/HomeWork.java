package Chapter3;


class customer{
	static int count = 0;
	public void printCustomer() {
		System.out.println(count+" objects are created");
	}
	
	customer(){
		count++;
	}
}
class employee{
	private static int empId = 0;
	private String name;
	private float salary;
	
	public void getdata(String name,float salary) {
		this.name = name;
		this.salary = salary;
	}
	public void print() {
		System.out.println(empId+" "+name+" "+salary);
	}
	
	employee(){
		empId++;
	}
}
public class HomeWork {

	public static void main(String[] args) {
//		employee e1 = new employee();
//		e1.getdata("Amar",18000);
//		e1.print();
//		employee e2 = new employee();
//		e2.getdata("Adi",19000);
//		e2.print();
//		employee e3 = new employee();
//		e3.getdata("Anish",1900);
//		e3.print();
		
		customer c1 = new customer();
		c1.printCustomer();
		customer c2 = new customer();
		c2.printCustomer();
		customer c3 = new customer();
		c3.printCustomer();
	}

}
