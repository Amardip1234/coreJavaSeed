package chapter5Abstraction;

abstract class Bank{
	int balance;
	Bank(){
		balance = 0;
	}
	public abstract void AddMoney(int money);
	public abstract void Debit(int money);
}

class UserOperation extends Bank{
	public void AddMoney(int money) {
		balance+=money;
		System.out.println(money+" is Credited to Your Account");
		System.out.println("Total Balance :"+balance);
	}
	public void Debit(int money) {
		balance-=money;
		System.out.println(money+" is Debited from Your Account");
		System.out.println("Remaining Balance :"+balance);
	}
}

class BankOperation extends Bank{

	public void AddMoney(int money) {
		System.out.println("Adding benefit");
		
		
	}

	public void Debit(int money) {
		// TODO Auto-generated method stub
		
	}
	
}
public class ABstractionEx {

	public static void main(String[] args) {
		UserOperation user1 = new UserOperation();
		user1.AddMoney(5000);
		user1.Debit(500);

		UserOperation user2 = new UserOperation();
		System.out.println(user2.balance);
		user2.AddMoney(6000);
		user2.Debit(2);
	}

}
