package AssignmentPractice2;

public class AssignmentOPerator {

	public static void main(String[] args) {
/*Use all assignment operators (+=, -=, *=, /=, %=) in a single program and print the result after each operation. Input: int num = 20;Expression:num += 5;num -= 3;num *= 2;num /= 4;num %= 3;*/

		int num=20;
		int add= num+=5;
		int sub= num-=3;
		int mul= num *= 2;
		int div= num /= 4;
		int quo= num %=3;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(quo);
		


	}

}
