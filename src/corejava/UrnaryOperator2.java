package corejava;

public class UrnaryOperator2 {

	public static void main(String[] args) {

		int a= 10;
		int b= 5;
		int sum = ++a - --b + a-- - b++;

		System.out.println(sum);
	}

}
// pre value(11) - post value4 + pre value11 - 4
