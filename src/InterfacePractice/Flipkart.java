package InterfacePractice;

public class Flipkart implements Ecommerce {

	@Override
	public void placeOrder(String item, int quantity) {
		System.out.println("Placed order on Flipkart: "+item +"Quantity: "+quantity);

		
	}

}
