package Chapter4;

public class Student {
	private Mydate birthDate;
	
	Student(){
		birthDate = new Mydate();
	}
	Student(Mydate d){
		birthDate = d;
	}
	
	public void print() {
		System.out.println("Student birthdate is "+ birthDate);
	}
	
}
