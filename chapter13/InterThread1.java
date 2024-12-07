package chapter13;

public class InterThread1 extends Thread{
	int sum = 0;
	public void run() {
//		synchronized (this) {
			for(int i = 1; i<=10; i++) {
				sum = sum+i;
			}
		System.out.println(sum + " "+ Thread.currentThread().getName());
//		this.notify();
//		}
		System.out.println("amar");
	}
}
