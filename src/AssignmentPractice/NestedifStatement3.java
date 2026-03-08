package AssignmentPractice;

public class NestedifStatement3 {

	public static void main(String[] args) {
		/*Check login credentials  
If the username is `"admin"`, then check if the password is `"1234"`.  
- If both match, print `"Login Successful"`  -Otherwise, print `"Invalid Credentials"`  */

		String username="Admin";
		String password="1234";
		
		if (username=="Admin") {
			System.out.println("Enter password");
			if (password=="1234") {
				System.out.println("Login Successfull");
			} 
			else {
				System.out.println("Invalid Credentials");

			}
		} 
		else {
			System.out.println("Invalid Credential");

		}

	}

}
