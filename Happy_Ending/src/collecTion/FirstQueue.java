package collecTion;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FirstQueue {
	public static void main(String[] args) {
		Queue<String> cars = new LinkedList<String>();
		
		cars.offer("Lamborghini");
		cars.offer("Audi");
		cars.offer("Toyota");
		cars.offer("BMW");
		System.out.println(cars);
		
		System.out.println(cars.peek());
		System.out.println(cars.poll());
		
		System.out.println(cars);
		
		Queue<Integer> numbers = new PriorityQueue<Integer>();	//upcasting
		
		numbers.offer(4);
		numbers.offer(3);
		numbers.offer(2);
		
		System.out.println(numbers);
		
		System.out.println(numbers.peek());
		System.out.println(numbers.poll());
		
		System.out.println(numbers);
	}
}

/*
//linkedList implementation of Queue
Queue<String> cars = new LinkedList<>();

//Array implementation of Queue
Queue<String> cars = new ArrayDeque<>();

//PriorityQueue implementation of Queue
Queue<String> cars = new PriorityQueue<>();

Methods:

1. add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
2. offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
3. element() - Returns the head of the queue. Throws an exception if the queue is empty.
4. peek() - Returns the head of the queue. Returns null if the queue is empty.
5. remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
6. poll() - Returns and removes the head of the queue. Returns null if the queue is empty.


*/