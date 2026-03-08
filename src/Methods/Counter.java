package Methods;

public class Counter {
	
	static int  staticCount=10;
	int nonStaticcount=5;
	
	public static void incrementStatic() {
		
		int result=++staticCount;
		
		System.out.println(result);
		
	}

	public void incrementNonstatic() {
		
		int result2=++nonStaticcount;
		
		System.out.println(result2);
		
	}
}
