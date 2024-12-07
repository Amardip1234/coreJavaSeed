package chapter12;

public class JoinEx extends Thread{
	public void run() {
		for(int i = 1; i<=4; i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		JoinEx t1 = new JoinEx();
		JoinEx t2 = new JoinEx();
		JoinEx t3 = new JoinEx();
		JoinEx t4 = new JoinEx();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 3");
		t1.start();
		
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		try {
			t2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		t3.start();

	}

}
