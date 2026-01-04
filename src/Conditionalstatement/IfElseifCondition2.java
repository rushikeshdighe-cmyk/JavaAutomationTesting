package Conditionalstatement;

public class IfElseifCondition2 {

	public static void main(String[] args) {
		// Check temperature levels  :Take a temperature value as input and classify it as:  
		//- `> 30°C` → `"Hot"`  - `20-30°C` → `"Warm"`  - `10-19°C` → `"Cold"`  - `< 10°C` → `"Very Cold"`  


		int t =9;
		
		if (t>30) {
			
			System.out.println("Hot Temperature");
			
		}
		else if (t>=20) {
			
			System.out.println("Warm Temperature");
			
		}
		else if (t>=10) {
			System.out.println("Cold Temperature");
			
		}
		else {
			System.out.println("Very cold Temperature");
		}
		
	}

}
