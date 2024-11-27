package chapter6innerClass;

class employee{
	static int empId = 30;
	static class manager{
		String name = "Amar";
		public void print() {
			System.out.println(name);
			System.out.println(empId);
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		employee.manager m = new employee.manager();
		m.print();

	}

}
