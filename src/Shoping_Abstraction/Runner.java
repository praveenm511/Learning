package Shoping_Abstraction;

public class Runner {

	public static void main(String[] args) {
//		CreditCardPayment creditCardPayment= new CreditCardPayment(10000.23,5001);
//		creditCardPayment.payBill(7000);
		
		ShoppingPayment shoppingPayment= new ShoppingPayment(5000,561328);
		shoppingPayment.payBill(6000);
	}

}
