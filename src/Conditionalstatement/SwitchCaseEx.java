package Conditionalstatement;

public class SwitchCaseEx {

	public static void main(String[] args) {
		// Print day of the week  
		//Take an integer (`1-7`) as input and print the corresponding  day using `switch`
		
		int day = 3;
		
		switch (day) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		
		
		default: System.out.println("invalid day");
		
		}	
		}

}
		
