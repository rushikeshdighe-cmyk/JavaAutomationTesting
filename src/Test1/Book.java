package Test1;

public class Book {

	String Title;
	String Author;
	int price;
	
	Book(String T,String A,int P){
		
		Title=T;
		Author=A;
		price=P;	
	}
	void displayDetails() {
		
		System.out.println("Title of the Book: "+Title);
		System.out.println("Author of the Book: "+Author);
		System.out.println("Price of the Book: "+ price);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book B1=new Book("AT Testing", "K S Sharma", 990);
		B1.displayDetails();
	}

}
