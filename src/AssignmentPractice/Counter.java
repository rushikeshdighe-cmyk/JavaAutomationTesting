package AssignmentPractice;

public class Counter {

	
		/* Create a class called Counter that:
		Has a static method called incrementStatic that increments a static variable staticCount and prints its value.
		Has a non-static method called incrementNonStatic that increments an instance variable nonStaticCount and prints its value.
		call these methods in another class called CopyCounter.*/
		
	 static int  staticCount=10;
	 int nonStaticCount=11;
	 
	 public static void incrementStatic()
	 {
	 int Result=++staticCount;
	 System.out.println(Result);
		
		

	}

	 public void incrementNonStatic()
	 {
		 int result1=++nonStaticCount;
		 
		 System.out.println(result1);
	 }
}
