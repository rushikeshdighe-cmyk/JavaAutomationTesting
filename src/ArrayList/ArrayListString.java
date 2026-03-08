package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListString {

	public static void main(String[] args) {

		//Creating arraylist of Stringtype
		
		ArrayList<String> numbers = new ArrayList<>();
		
        // 2. Adding elements to ArrayList
		numbers.add("Red" );
		numbers.add("Blue" );
		numbers.add("Green" );
		System.out.println("After Adding the Elements"+numbers);

		//retrieve the element at index 2 from an ArrayList 
		System.out.println("Retrieve the index 2: "+ numbers.get(2));
		
		//insert "Purple" at the second position in an ArrayList of colors
		numbers.add(1, "Purple");
		System.out.println("After Inserting the value: "+numbers);
		
		//remove an element "Green" from an ArrayList
		numbers.remove("Green");
		System.out.println("After Removing the Green Element: "+numbers);
		
		//print whole ArrayList
		System.out.println("whole Arraylist: "+numbers);
		
		//sort an ArrayList of colors in alphabetical order.
		Collections.sort(numbers);
		System.out.println("After Sorting: "+numbers);
		
		//reverse an ArrayList
		Collections.reverse(numbers);
		System.out.println("After Reverse: "+numbers);
		
		//Iterate through an ArrayList using a for-each loop
		System.out.println("Iterate loop");
		 for (String a : numbers) {
			System.out.println(a);
		}
			
		}
	}


