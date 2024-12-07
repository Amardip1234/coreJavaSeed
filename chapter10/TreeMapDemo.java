package chapter10;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<Integer,String> i = new TreeMap<Integer,String>();
		i.put(101, "Dubai");
		i.put(102, "india");
		System.out.println(i.firstKey());
		System.out.println(i.containsKey(101));
		System.out.println(i.containsValue("india"));
		System.out.println(i.isEmpty());
		System.out.println(i);
		

	}

}
