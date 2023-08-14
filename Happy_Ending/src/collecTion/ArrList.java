package collecTion;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		
		obj.add("23");
		obj.add(23);
		obj.add("String");
		obj.add(23.3);
		obj.add(00.00);
		obj.add("\0");
		
//		System.out.println(obj);
		
//		for (Object str : obj) {
//			System.out.println(str);
//		}
		
		//getter setter methods
//		System.out.println(obj.get(1));
		obj.set(2, "Mayank");
		System.out.println(obj.get(2));
		
	}
}
/*
ArrayList: Dynamic Array

syntax: ArrayList arrlist = new ArrayList();

Task:

**Task 1: Unique Elements**
Write a Java program that takes an ArrayList of integers as input. Remove any duplicate elements from the ArrayList and print the updated list.

**Task 2: Student Database**
Create a program to manage a student database using ArrayList. Each student entry should include their name, age, and grade. Implement functions to add new students, remove students by name, update student information, and display the entire database.

**Task 3: Palindrome Check**
Implement a program that reads a list of strings into an ArrayList. For each string, determine whether it is a palindrome (reads the same forwards and backwards) and print the result.

**Task 4: Shopping Cart**
Develop a shopping cart system using ArrayList to store product names and their corresponding prices. Implement functions to add items to the cart, remove items by name, calculate the total price, and display the cart contents.

**Task 5: Matrix Transposition**
Write a Java program that transposes a given square matrix (an ArrayList of ArrayLists representing a 2D array). The transpose of a matrix is obtained by swapping the rows and columns. Implement a function to perform the matrix transposition and print the resulting transposed matrix.



*/
