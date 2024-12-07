package chapter10;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> hs = new Hashtable<Integer,String>();
		hs.put(101, "Amar");
		hs.put(102, "Addi");
		hs.put(103, "Anish");
		hs.put(104, "asd");
		
		Iterator<Integer> i = hs.keySet().iterator();
		
		while(i.hasNext()) {
			Integer Key = i.next();
			System.out.println("Key from hashtable: "+Key+" Value for the key is: "+hs.get(Key));
		}

	}

}
