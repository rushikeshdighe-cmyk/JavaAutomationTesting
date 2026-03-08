package Constructor;

public class Book1 {
	
	String title;
	String author;
	int price;
	
	Book1(String t,String a, int c){
		
		title=t;
		author=a;
		price=c;
	}
		void displayMethod() {
			
			System.out.println("Book Title is: "+ title);
			System.out.println("Author is: "+author);
			System.out.println("Price is:" +price);
			
		}
		

	public static void main(String[] args) {


		Book1 B1=new Book1("Testing Book","B K Sharma",180);
		
		B1.displayMethod();
	}

}
