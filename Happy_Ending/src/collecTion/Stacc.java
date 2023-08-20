package collecTion;

import java.util.Stack;

public class Stacc {
	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<Integer>();
		
		numbers.push(1);
		numbers.push(10);
		numbers.push(18);
		numbers.push(67);
		numbers.push(34567);
		
		System.out.println(numbers);
		
		Stack<String> animals = new Stack<>();
		
		animals.add("DOG");
		animals.push("HORSE");
		animals.push("CROCODILE");
		System.out.println(animals);
		
		System.out.println(numbers.peek());
		numbers.pop();
		System.out.println(numbers);
		System.out.println(numbers.peek());
		
		System.out.println(animals.search("DOG"));
//		animals.clear();
//		System.out.println(animals.empty());
	}
}


/*

1. Task Management System:
   Create a task management system where users can add, edit, and remove tasks. Use an ArrayList to store tasks and provide functionalities to push tasks onto a Stack to simulate an undo feature.

2. Inventory Tracking:
   Develop an inventory tracking system using a List of items, such as ArrayList or Vector. Implement methods to add, update, and remove items from the inventory. Use a Stack to keep track of changes and provide a way to undo recent modifications.

3. Text Editor:
   Build a simple text editor that supports undo and redo functionalities using Stacks. As users make changes to the text, push the changes onto the undo stack. Implement a redo stack to allow users to revert their undo actions.

4. Playlist Management:
   Create a music playlist management system where users can add songs to a playlist. Use an ArrayList or Vector to store the playlist and a Stack to implement a 'Recently Played' feature. Implement an Iterator to iterate through the playlist, and a Reversed Iterator to show the user their playback history in reverse order.

5. Data Processing Pipeline:
   Design a data processing pipeline that involves multiple stages of data transformation. Use a List to store the intermediate data at each stage. Implement a Stack to manage the stages of processing, allowing for a rollback in case of errors. Use an Iterator to traverse the processed data and a Reversed Iterator to review the processing steps in reverse order.

Sample Test Cases:

Certainly! Here are some test cases and sample outputs for the problems I mentioned earlier:

1. Task Management System:

   Test Case 1:
   - Add task: "Buy groceries"
   - Add task: "Complete assignment"
   - Undo last action (removes "Complete assignment" task)

   Sample Output:
   
   Tasks: ["Buy groceries"]
   

2. Inventory Tracking:

   Test Case 1:
   - Add item: "Laptop" with quantity 5
   - Update quantity of "Laptop" to 7
   - Remove item: "Laptop"

   Sample Output:
   
   Inventory: []
   

3. Text Editor:

   Test Case 1:
   - Type "Hello, world!"
   - Undo last action (removes "!")
   - Redo undone action (restores "Hello, world!")

   Sample Output:
   
   Text: Hello, world!
   

4. Playlist Management:

   Test Case 1:
   - Add song: "Shape of You" by Ed Sheeran
   - Add song: "Uptown Funk" by Mark Ronson
   - Play a song
   - Play another song
   - View playback history in reverse order

   Sample Output:
   
   Current Playlist: ["Shape of You", "Uptown Funk"]
   Now Playing: "Uptown Funk"
   Now Playing: "Shape of You"
   Playback History: ["Uptown Funk", "Shape of You"]
   

5. Data Processing Pipeline:

   Test Case 1:
   - Stage 1: Transform data
   - Stage 2: Further transform data
   - Stage 3: Process data and encounter an error
   - Rollback to Stage 2

   Sample Output:
   
   Stage 1: Data transformed
   Stage 2: Data further transformed
   Error encountered in Stage 3. Rolling back to Stage 2...
   Data at Stage 2: Transformed data
   

*/