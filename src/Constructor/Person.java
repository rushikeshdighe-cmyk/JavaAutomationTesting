package Constructor;

public class Person {
	
	String name;
	int age;
	
	Person(){
		
		name="Amol";
		age=18;
	}
	     public void greet() {
			
			System.out.println("Hello"+ name);
			System.out.println("Your Age is: "+age);
		}
	

	public static void main(String[] args) {
 
		Person p1=new Person();
		p1.greet();

	}

}
