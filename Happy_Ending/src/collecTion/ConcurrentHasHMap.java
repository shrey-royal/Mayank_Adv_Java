package collecTion;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHasHMap {
	public static void main(String[] args) {
		// Creating a hashmap of even numbers
//        HashMap<String, Integer> evenNumbers = new HashMap<>();
//        evenNumbers.put("Two", 2);
//        evenNumbers.put("Four", 4);
//        System.out.println("HashMap: " + evenNumbers);

        // Creating a concurrent hashmap from other map
//        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNumbers);
//        numbers.put("Three", 3);
//        System.out.println("ConcurrentHashMap: " + numbers);
		
		
		ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);

        // forEach() without transformer function
        numbers.forEach(4, (k, v) -> System.out.println("key: " + k + " value: " + v));

        // forEach() with transformer function
        System.out.print("Values are ");
//        numbers.forEach(4, (k, v) -> v, (v) -> System.out.print(v + ", "));
        System.out.println(numbers.reduce(4, (k, v) -> v, (v1, v2) -> (v1+v2)));
	}
}

/*
Notice the part new ConcurrentHashMap<>(8, 0.6). Here, the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this map is 8. Meaning, it can store 8 entries.
loadFactor - The load factor of this map is 0.6. This means, whenever our hash table is filled by 60%, the entries are moved to a new hash table of double the size of the original hash table.

By default,

the capacity of the map will be 16
the load factor will be 0.75


The forEach() method iterates over our entries and executes the specified function.

It includes two parameters.

parallelismThreshold - It specifies that after how many elements operations in a map are executed in parallel.
transformer - This will transform the data before the data is passed to the specified function.

Variation of forEach() Method

forEachEntry() - executes the specified function for each entry
forEachKey() - executes the specified function for each key
forEachValue() - executes the specified function for each value

Here,

4 is a parallel threshold
(k, v) -> v is a transformer function. It transfers the key/value mappings into values only.
(v1, v2) -> v1+v2 is a reducer function. It gathers together all the values and adds all values.
*/
