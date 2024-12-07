package chapter11;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> l = Stream.of(11,12,13,14,50,60).filter(x->x%2==0).filter(x->x<20).collect(Collectors.toList());
		System.out.println(l);

		
//		List<String> names = Arrays.asList("Amar","Addi","tejas","sahil","panu");
//		
//		List<String> filteredNames = names.stream().filter(name->name.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(filteredNames);
	}

}
