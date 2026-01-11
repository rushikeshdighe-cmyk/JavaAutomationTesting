package IterationStatement;

public class DoWhileTableof5 {

	public static void main(String[] args) {

		int i=1;
		int a=5;
		int sum=0;
		
		do {
			
			sum=a*i;
			
			System.out.println(a+"*"+i+"="+sum);
			
			i++;
			
		} while (i<=10);
	}

}
