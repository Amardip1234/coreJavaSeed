package chapter10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("India");
		l.add("Pakistan");
		l.add("America");
		l.add("India");
		System.out.println(l);
		l.addFirst("Indonesia");
		l.addLast("srilanka");
		
		System.out.println(l);
		
		System.out.println(l.contains("India"));
		Collections.sort(l);
		System.out.println(l);
		System.out.println(l.get(2));
		
		
		//Iterator interface
		
		System.out.println();
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
