package collecTion;

import java.util.ArrayList;
import java.util.Random;

public class TypeSafety {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		list.add(123);
//		list.add("2");
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			list.add(rand.nextInt(100));
		}
		
		System.out.println(list);
	}
}
