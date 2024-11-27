package Practise;

public class BasicProblems {
	public static int countDigits(int a) {
		int cnt = 0;
		int num = a;
		while(num > 0) {
			cnt++;
			num/=10;
		}
		return cnt;
	}
	
	public static int reverseNum(int a) {
		int num = a;
		int ans = 0;
		int rem;
		while(num>0) {
			rem = num%10;
			ans = ans*10+rem;
			num/=10;
		}
		
		return ans;
	}
	
	public static void palindrome(int a) {
		int num = a;
		int rev = reverseNum(num);
		if(rev == num) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
	
	public static void primeNumber(int a) {
		int counter = 0;
		for(int i = 1; i<=a; i++) {
			if(a%i == 0) {
				counter++;
			}
		}
		if(counter == 2) {
			System.out.println("It is prime number");
		}else {
			System.out.println("Its not");
		}
	}
	public static void main(String[] args) {
		
		System.out.println(countDigits(123));
		System.out.println(reverseNum(1234));
		palindrome(12121);
		primeNumber(12);
	}

}
