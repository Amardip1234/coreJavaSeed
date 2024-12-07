package chapter12;


class SimpleThread extends Thread{
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}

class ThreadsByrun implements Runnable{

	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	
}
public class ThreadDemo extends Thread{

	public static void main(String[] args) {
//		SimpleThread t1 = new  SimpleThread();
//		t1.start();
//		t1.setName("Thread 1");
//		SimpleThread t2 = new  SimpleThread();
//		t2.start();
//		t2.setName("Thread 2");
//		System.out.println(" By runnable interface");
		
		Runnable r1 = new ThreadsByrun();
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r1);
		Thread t5 = new Thread(r1);
		t3.start();
		t3.setName("thread 3");
		t4.setName("thread 4");
		t5.setName("thread 5");
		t4.start();
		t5.start();
		
	}

}
