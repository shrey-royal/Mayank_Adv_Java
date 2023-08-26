package collecTion;

import java.util.EnumSet;

public class ENumSet {
	public static void main(String[] args) {
		EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
		EnumSet<Day> weekdaysExceptMonday = EnumSet.complementOf(EnumSet.of(Day.MONDAY));
		EnumSet<Day> allDays = EnumSet.	allOf(Day.class);
		EnumSet<Day> emptySet = EnumSet.noneOf(Day.class);
		
		System.out.println("Weekends: " + weekend);
		System.out.println("Weekdays Except Monday: " + weekdaysExceptMonday);
		System.out.println("All Days: " + allDays);
		System.out.println("Empty Set: " + emptySet);
		
		EnumSet<Day> workingDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
		workingDays.add(Day.SATURDAY);
		workingDays.remove(Day.MONDAY);
		
		System.out.println(workingDays);
		
		System.out.println("Is wednesday a working day? " + workingDays.contains(Day.WEDNESDAY));
		
	}
}
/*

**Problem 1: Unique Names**
You are building a registration system for an event. Design a program that takes a list of participant names as input and returns a list of unique names using a `Set` to eliminate duplicates.

**Problem 2: Common Elements**
Write a Java method that takes two arrays as input and returns a `Set` containing the elements that are common between the two arrays.

**Problem 3: Vowel Count**
Create a program that reads a string from the user and then counts the number of unique vowels (a, e, i, o, u) present in the string using a `Set`.

**Problem 4: Word Anagrams**
Implement a function that takes a list of words as input and groups anagrams together. An anagram is a word formed by rearranging the letters of another word. Use a `Set` to store words with the same set of letters.

**Problem 5: Set Operations**
Design a program that demonstrates various set operations (union, intersection, difference) on two sets of integers. Allow the user to input the sets and choose the operation to perform using a `Set`.

--------------------------------------------

Test Cases:

**Problem 1: Unique Names**
Input: ["Alice", "Bob", "Alice", "Charlie", "David", "Bob"]
Output: ["Alice", "Bob", "Charlie", "David"]

**Problem 2: Common Elements**
Input: [1, 3, 5, 7, 9], [2, 4, 6, 8, 10]
Output: []

Input: [1, 3, 5, 7, 9], [3, 5, 8, 10]
Output: [3, 5]

**Problem 3: Vowel Count**
Input: "Hello, how are you?"
Output: 4 (a, e, o, u)

**Problem 4: Word Anagrams**
Input: ["listen", "silent", "dog", "god", "act", "cat"]
Output: [["listen", "silent"], ["dog", "god"], ["act", "cat"]]

**Problem 5: Set Operations**
Set A: [1, 2, 3, 4, 5]
Set B: [4, 5, 6, 7, 8]

Union: [1, 2, 3, 4, 5, 6, 7, 8]
Intersection: [4, 5]
Difference (A - B): [1, 2, 3]
Difference (B - A): [6, 7, 8]

 
*/
