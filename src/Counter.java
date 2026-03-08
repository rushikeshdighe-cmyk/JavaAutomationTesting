
public class Counter {
	int nonStaticCount=3;
	static int staticCount=2;
	static void incrementStatic() {
		 
		 System.out.println(++staticCount);	
	}
	
	void incrementNonStatic() {
		
		System.out.println(++nonStaticCount);
	}

	public static void main(String[]args) {
		Counter.incrementStatic();
		Counter C1=new Counter();
		C1.incrementNonStatic();
	}
}
