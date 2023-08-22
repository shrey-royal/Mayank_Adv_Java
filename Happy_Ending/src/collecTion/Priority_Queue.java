package collecTion;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(45);
		pq.add(34);
		pq.add(333);
		pq.add(57689);
		pq.add(1234567890);
		/*
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.remove(45));
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		*/
		
		Iterator<Integer> i = pq.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
			System.out.print(", ");
		}
		System.out.println();
		
		
		PriorityQueue<Integer> nums = new PriorityQueue<Integer>(new CustomComparator());
		Random rand = new Random();
		for (int j = 0; j < 10; j++) {
			nums.add(rand.nextInt(100));
		}
		
		System.out.println(nums);
		
	}
}

class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		int value = n1.compareTo(n2);
		if(value > 0) {
			return -1;
		} else if(value < 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
}