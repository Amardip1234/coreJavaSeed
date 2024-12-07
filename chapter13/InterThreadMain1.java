package chapter13;

class abc extends Thread{
	public void run() {
		synchronized (this) {
			
		
		for(int i = 1; i<=5; i++) {
			System.out.println("Hello");
		}
		this.notify();
		}
	}
}
public class InterThreadMain1{

	
	public static void main(String[] args) throws InterruptedException{
		InterThread1 t1 = new InterThread1();
		abc t2 = new abc();
		t1.setName("One");
		t2.setName("Two");
		t1.start();
		t2.start();
		
		
		synchronized (t2) {
			t2.wait();
			
		}
		

	}

}
