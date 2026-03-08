package AssignmentPractice;

public class Book1 {
	
	String name;
	String Author;
	int price;
	
	Book1(String n,String A,int P){
		
		name=n;
		Author=A;
		price=P;
		
		
	}
	
	void displayDetails(){
		
		System.out.println("Book Title: "+ name);
		System.out.println("Author of Book: "+ Author);
		System.out.println("Price: "+ price);
	}
	
	

	public static void main(String[] args) {
		/*Create a Book Class with Parameterized Constructor
Write a class called Book that:
Has three instance variables: title, author, and price.
The class should have a parameterized constructor that initializes all three variables.
Create a method displayDetails that prints the details of the book.*/

		Book1 B1=new Book1("AT Testing", "K S Sharma", 990);
		B1.displayDetails();

	}

}
