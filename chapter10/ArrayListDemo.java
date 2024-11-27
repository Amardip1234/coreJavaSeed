package chapter10;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		System.out.println(a);
		a.add("Amar");
		System.out.println(a);
		a.add(30);
		System.out.println(a);
		
		System.out.println(a.get(2));
		a.add(0,100);
		System.out.println(a);
		
		for(Object o :a) {
			System.out.println(o);
		}
		
		System.out.println("Size of list: "+ a.size());
		
		System.out.println(a.contains(10));
		
		a.remove(0);
		
		System.out.println(a);

	}

}
