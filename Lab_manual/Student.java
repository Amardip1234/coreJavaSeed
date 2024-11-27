package Lab_manual;
import java.util.*;
public class Student {
	private String studentId;
	private String studentName ;
	private String studentAddess;
	private String collegeName= "ABC Technical Institute";
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentId, String studentName, String studentAddess, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddess = studentAddess;
		this.collegeName = collegeName;
	}
	
	public Student(String studentId, String studentName, String studentAddess) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddess = studentAddess;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddess=" + studentAddess
				+ ", collegeName=" + collegeName + "]";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String studentId,studentName,studenAddress,collegeName;
		
		while(true) {
			System.out.println("Is the student from ABC Technical Institute ");
			String userinp = sc.nextLine();
			
			if(userinp.equalsIgnoreCase("yes")) {
				System.out.println("Enter stdId:");
				studentId = sc.nextLine();
				System.out.println("Enter name:");
				studentName = sc.nextLine();
				System.out.println("Enter Address:");
				studenAddress = sc.nextLine();
				Student s1 = new Student(studentId,studentName,studenAddress);
				System.out.println(s1);
				break;
			}else if(userinp.equalsIgnoreCase("no")) {
				System.out.println("Enter stdId:");
				studentId = sc.nextLine();
				System.out.println("Enter name:");
				studentName = sc.nextLine();
				System.out.println("Enter Address:");
				studenAddress = sc.nextLine();
				System.out.println("Enter collegeName:");
				collegeName = sc.nextLine();
				Student s2 = new Student(studentId,studentName,studenAddress,collegeName);
				System.out.println(s2);

				break;
			}else {
				System.out.println("Wrong input");
				//System.out.println("Is the student from ABC Technical Institute ");
			}
			
		}
		
		
		
		
		
	}

}
