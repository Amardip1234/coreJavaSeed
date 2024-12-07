package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Peak {

	public static void main(String[] args) {
		List<Integer> l = Stream.of(11,12,13,14,15).filter(x->x%2==0)
				.peek(x->System.out.println("Filtered"+x)).map(x->x*10)
				.collect(Collectors.toList());
		
		System.out.println(l);
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(11,12,13,13,14,15,16));
		List<Integer> ls = l1.stream().distinct().collect(Collectors.toList());
		System.out.println(ls);
		
		List<Integer> limit = l1.stream().limit(3).collect(Collectors.toList());
		System.out.println(limit);
		
		List<Integer> skip = l1.stream().skip(2).collect(Collectors.toList());
		System.out.println(skip);
	}

}
