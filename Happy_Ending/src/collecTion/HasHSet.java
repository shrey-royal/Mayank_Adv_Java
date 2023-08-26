package collecTion;

import java.util.EnumSet;
import java.util.HashSet;

public class HasHSet {
	
	
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(23);
		numbers.add(5767);
		numbers.add(3334);
		numbers.add(567);
		
		System.out.println(numbers);
		
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(000);
		num.add(998);
		num.add(4567890);
		num.add(5767);
		
		
		//union->addAll();
		numbers.addAll(num);
		System.out.println(numbers);
		
		//intersection->retainAll();
		numbers.retainAll(num);
		System.out.println(numbers);
		
		//subset->containsAll();
		System.out.println(numbers.containsAll(num));
	}
}
