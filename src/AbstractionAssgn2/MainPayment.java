package AbstractionAssgn2;

public class MainPayment {

	public static void main(String[] args) {
		
		Payment P1=new CreditCardPayment();
		P1.makePayment(7383.39);
		
		Payment P2=new UPIPayment();
		P2.makePayment(63873.87);


	}

}
