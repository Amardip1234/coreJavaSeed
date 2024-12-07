package chapter10;
import java.util.HashSet;
public class SetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
//		System.out.println(hs.contains(40));
//		System.out.println(hs.size());
//		hs.remove(30);
//		System.out.println(hs);
		
		
		
//		if(hs.isEmpty()) {
//			System.out.println("it is empty");
//		}else {
//			System.out.println("something present");
//		}
	}

}
