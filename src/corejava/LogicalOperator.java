package corejava;

public class LogicalOperator {

	public static void main(String[] args) {
		int num=-3;
		
		if(num < 0 || num > 100 )
		{
			System.err.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
