package Interface;

public class Flipkart implements Ecommerce {

	@Override
	public void placeOrder(String item, int quantity) {
		System.out.println( "Order placed on Flipkart: "+item+" X "+quantity);


		
	}
	
	

}
