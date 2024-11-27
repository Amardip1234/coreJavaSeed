package chapter10;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		HashMap mp = new HashMap();
		
		mp.put(21, "Twenty one");
		mp.put(31, "Thirty one");
		
		Iterator<Integer> it = mp.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("Key: "+key+" Value: "+mp.get(key));
		}
	}

}
