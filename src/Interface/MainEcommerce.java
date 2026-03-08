package Interface;

public class MainEcommerce {

	public static void main(String[] args) {


		Ecommerce E1=new Amazon();
		E1.placeOrder("Mobille", 89387);
		
		Ecommerce E2=new Flipkart();
		E2.placeOrder("Mobile", 93837);
	}

}
