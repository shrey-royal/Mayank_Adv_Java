package collecTion;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>(Arrays.asList("Ravi", "Vijay", "Ajay", "Anuj", "Gaurav", "Harsh", "Virat", "Gaurav", "Harsh", "Amit"));
		
		System.out.println(ll);
//		ll.removeFirst();
//		System.out.println(ll);
//		ll.removeLast();
//		System.out.println(ll);
//		System.out.println(ll.get(2));
//		System.out.println(ll.removeFirstOccurrence("Gaurav"));
//		System.out.println(ll.removeLastOccurrence("Harsh"));
//		System.out.println(ll);
		
		Iterator<String> i;
		
		i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n\t");
		
		i = ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}