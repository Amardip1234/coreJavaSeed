package chapter13;

public class Account {
	private int accNO;
	private String name;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int accNO, String name, double balance) {
		super();
		this.accNO = accNO;
		this.name = name;
		this.balance = balance;
	}
	
	public synchronized void withdraw(double amount) throws InterruptedException {
		System.out.println("Amount before withdraw "+balance);
		balance = balance-amount;
		Thread.sleep(1000);
		System.out.println("Amount after withdraw "+balance);
		Thread.sleep(1000);
	}
	public void deposit(double amount)throws InterruptedException {
		synchronized (this) {
			System.out.println("Amount before deposit "+balance);
			balance = balance+amount;
			Thread.sleep(1000);
			System.out.println("Amount before deposit "+balance);
			Thread.sleep(1000);
		}
		System.out.println("end of transaction");
	}
	@Override
	public String toString() {
		return "Account [accNO=" + accNO + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
