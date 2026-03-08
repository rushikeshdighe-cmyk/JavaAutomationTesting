package Enacpsulation;

public class MainStudent {

	public static void main(String[]args) {
		
		Student S1=new Student();
		S1.setName("Rushikesh");
		S1.getAge(31);
		System.out.println(S1.getName());
		System.out.println(S1.setAge());
	}
}
