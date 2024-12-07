package chapter10;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> numQ = new PriorityQueue<Integer>();
		numQ.add(100);
		numQ.offer(500);
		numQ.offer(50);
		
		System.out.println(numQ.peek());
		System.out.println(numQ);
		
		while(!numQ.isEmpty()) {
			Integer i = numQ.poll();
			System.out.println("Removed element: "+ i);
		}
		System.out.println(numQ);

	}

}
