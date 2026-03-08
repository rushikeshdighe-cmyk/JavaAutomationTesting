package Constructor;

public class Book {
	
	String title;
	String author;
	int price;
	
	Book(){
		
		title="Testing Material";
		author="K s Wankhade";
		price=123;
		
		System.out.println("Book Title; "+ title);
		System.out.println("Author: " + author);
		System.out.println("price: "+ price);
		
	}
	

	public static void main(String[] args) {

		Book b=new Book();
	}

}
