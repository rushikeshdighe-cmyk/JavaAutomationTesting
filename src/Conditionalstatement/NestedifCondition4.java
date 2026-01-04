package Conditionalstatement;

public class NestedifCondition4 {

	public static void main(String[] args) {
		// Check login credentials  
		//If the username is `"admin"`, then check if the password is `"1234"`.  
		//- If both match, print `"Login Successful"`  -Otherwise, print `"Invalid Credentials"`  


	 
		String username= "admin";
		String Password= "1234";
		
		if (username=="admin") {
			
			System.out.println("Enter Password");
			
			if (Password=="1234") {
				
				System.out.println("Login Successfully");
				
			} else {
				
				System.out.println("Invalid Credentials");

			}
			
		} else {
			
			System.out.println("invalid Credentials");

		}
	}

}
