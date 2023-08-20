package collecTion;

import java.util.Iterator;
import java.util.Vector;

public class Vektor {
	public static void main(String[] args) {
		Vector<String> cars = new Vector<>();
		
		//add elements into vector
		//add(element) // add(index, element) // addAll(vector)
		
		cars.add("Ferrari");
		cars.add("Rolls Royce");
		
		cars.add(2, "Bugatti");
		System.out.println(cars);
		
		Vector<String> vehicle = new Vector<>();
		vehicle.add("TOYOTA");
		vehicle.addAll(cars);
		System.out.println(vehicle);
		
		//access vector elements
		//get(index) // iterator()
		
		System.out.println(cars.get(1));
		Iterator<String> iterate = vehicle.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next() + ", ");
		}
		System.out.println();
		
		cars.set(1, "HONDA");
		System.out.println(cars);
	}
}
