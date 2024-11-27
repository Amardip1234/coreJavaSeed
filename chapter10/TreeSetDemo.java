package chapter10;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(10);
		System.out.println(ts);
		ts.add(null);
		
		
		
		System.out.println(ts);

	}

}
