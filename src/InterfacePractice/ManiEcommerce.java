package InterfacePractice;

public class ManiEcommerce {

	public static void main(String[] args) {
		Amazon A=new Amazon();
		A.placeOrder("Mobiles", 2);
		
		Flipkart F=new Flipkart();
		F.placeOrder("office Chair", 10);


	}

}
