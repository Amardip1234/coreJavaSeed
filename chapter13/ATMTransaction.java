package chapter13;

public class ATMTransaction extends Thread{
	Account ac;
	double amount;
	boolean flag;
	
	
	
	public ATMTransaction(Account ac, double amount, boolean flag) {
		super();
		this.ac = ac;
		this.amount = amount;
		this.flag = flag;
	}

	public void run() {
		try {
			if(flag == true) {
				ac.deposit(amount);
			}else {
				
				ac.withdraw(amount);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Account ac = new Account(121,"Amar",10000);
		Thread t1 = new ATMTransaction(ac, 2000.00, true);
		Thread t2 = new ATMTransaction(ac, 3000.00, false);
		t1.start();
		t2.start();

	}

}
