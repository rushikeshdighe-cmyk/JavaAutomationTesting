package corejava;


import java.util.Scanner;

public class UserDetailsconcate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter Your Full Name:");
		String fullname = sc.nextLine();
		
		System.err.println("Enter Your Course Name:");
		String coursename = sc.nextLine();
		
		System.err.println("Enter Your age:");
		int age = sc.nextInt();
		
		String result= "My Name is" + fullname + "My course name is"+ coursename + "My age is"+ age;
		
		System.out.println(result);
		
		sc.close();

	}

}
