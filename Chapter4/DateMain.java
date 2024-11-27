package Chapter4;

public class DateMain {

	public static void main(String[] args) {
		Account a = new Account(new Mydate(24,04,2024));
		a.print();
		Student s = new Student(new Mydate(26,05,2006));
		s.print();

	}

}
