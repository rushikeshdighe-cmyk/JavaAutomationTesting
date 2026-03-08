package AssignmentPractice;

public class Switchcase3 {

	public static void main(String[] args) {
		/*Print month name  
Take a number (`1-12`) as input and print the month name using `switch`. */
		
		int month=8;
		
		switch (month) {
		case 1:System.out.println("January");
		break;
		case 2:System.out.println("Febuary");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("june");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("Augest");
		break;
		case 9:System.out.println("Sept");
		break;
		case 10:System.out.println("Oct");
		break;
		case 11:System.out.println("Nov");
		break;
		case 12:System.out.println("Dec");
		break;
		

		default:System.out.println("Invalid Inputs");
			break;
		}


	}

}
