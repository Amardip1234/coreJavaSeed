package Chapter4;

public class Account {
	private Mydate accountCreDate;
	
	Account(){
		accountCreDate = new Mydate();
	}
	
	Account(Mydate d){
		accountCreDate = d;
	}
	
	public void print() {
		System.out.println("Account creation date is "+ accountCreDate);
	}
}
