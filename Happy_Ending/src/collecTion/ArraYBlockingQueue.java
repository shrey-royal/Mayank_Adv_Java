package collecTion;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArraYBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<String> cars = new ArrayBlockingQueue<String>(5);
		
		/*
		cars.add("Lamborghini");
		cars.add("Ferrari");
		cars.add("Honda");
		
		cars.offer("Hyundai");
		cars.offer("Tata");
		
		System.out.println(cars);
		*/
		
		try {
			cars.put("abcd");
			cars.put("xyz");
			cars.offer("Bugatti", 2000, TimeUnit.MILLISECONDS);
			
			cars.take();
		} catch (Exception e) {
			 System.out.println(e);
		}
		System.out.println(cars);
	}
}
