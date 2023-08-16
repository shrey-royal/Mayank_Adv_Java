package collecTion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TypeSafety {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		list.add(123);
//		list.add("2");
//		Random rand = new Random();
//		for (int i = 0; i < 5; i++) {
//			list.add(rand.nextInt(100));
//		}
//		
//		System.out.println(list);
		
		
//		ArrayList<String> list = new ArrayList<String>() {{
//			add("Sweta");
//			add("Barkha");
//		}};
		
//		ArrayList<String> list = new ArrayList<String>(Stream.of("Sweta", "Barkha").collect(Collectors.toList()));
		
		ArrayList<String> fruits = new ArrayList<String>();
		Collections.addAll(fruits, "Apple", "Banana", "Orange");
		
		System.out.println(fruits);
	}
}
