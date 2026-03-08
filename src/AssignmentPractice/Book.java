package AssignmentPractice;

public class Book {
	
	String title;
	String Author;
	int price;
	
	Book(){
		
		title="Automation Testing";
		Author="K S Sharma";
		price=90;
		
		System.out.println("Title of BooK: "+ title);
		System.out.println("Author of Book: "+ Author);
		System.out.println("Price of the book: "+ price);
	}
	
	

	public static void main(String[] args) {
		/*Create a Book class with Constructor
Write a class called Book that:
Has three instance variables: title, author, and price.
The class should have a constructor that initializes all three variables.
Create a method display Details that prints the details of the book.*/
		
		new Book();


	}

}
