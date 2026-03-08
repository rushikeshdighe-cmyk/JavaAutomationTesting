package AssignmentPractice;

public class ElseifStatement2 {

	public static void main(String[] args) {
		/*Check temperature levels  :Take a temperature value as input and classify it as:  
- `> 30°C` → `"Hot"`  - `20-30°C` → `"Warm"`  - `10-19°C` → `"Cold"`  - `< 10°C` → `"Very Cold"`  */
		
		int temp=57;
		
		if (temp>30) {
			System.out.println("Temperature is HOT");
			
		}
		else if (temp>=20) {
			System.out.println("Temp is Warm");
			
		} 
		
		else if(temp>=10) {
			System.out.println("Cold");

		}
		else {
			System.out.println("Very Cold");
		}


	}

}
