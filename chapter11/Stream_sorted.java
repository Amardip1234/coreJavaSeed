package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream_sorted {

	public static void main(String[] args) {
		List<Integer>list1 = new ArrayList<Integer>(Arrays.asList(52,11,33,44,22));
		System.out.println("Ascending order");
		
		list1.stream().sorted().forEach(System.out::println);
		
		System.out.println("descending order");
		
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		

	}

}
