package collecTion;

import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Element 1");
		al.add(Boolean.TRUE);
		al.add(233.3);
		al.add(456);
		al.add("123456");
		
		System.out.println(al);
		
		//void add method
//		al.add(2, "Inserted element @ 2nd Position");
//		System.out.println(al);
		
//		ArrayList new_al = new ArrayList();
		
//		new_al.add("w");
//		new_al.add(al);
		
//		System.out.println(new_al.addAll(al));	//boolean addAll
//		new_al.clear();
//		al = (ArrayList) new_al.clone();
//		System.out.println(new_al);
//		System.out.println(al);
		
//		al.ensureCapacity(5);
		
//		System.out.println(al.contains("w"));
//		System.out.println(al.containsAll(new_al));
//		System.out.println(al.get(5));
//		System.out.println(al.hashCode());
//		System.out.println(al.isEmpty());
//		System.out.println(al.indexOf(456));
//		System.out.println(new_al.lastIndexOf(true));
//		System.out.println(new_al.removeAll(al));
		
//		ArrayList ri = new ArrayList();
//		
//		for (int i = 0; i < 10; i++) {
//			ri.add(i+1);
//		}
//		
//		System.out.println(ri.removeIf(n -> ((int)n % 2 == 0)));
//		
//		System.out.println(ri);
//		
//		System.out.println(ri.size());
		
		ArrayList last = new ArrayList();
		
		last.add("Shrey");
		last.add("Krutarth");
		last.add("Yash");
		last.add("Zafar");
		
		last.replaceAll(n -> ((String) n).toUpperCase());
		
		System.out.println(last);
		
//		string method -> replaceAll(regexPattern, inputString);
		
		
	}
}
