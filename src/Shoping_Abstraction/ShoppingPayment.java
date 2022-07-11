package Shoping_Abstraction;

public class ShoppingPayment extends RRPaymentServices{
	private static int counter=1000;
	private String paymentId="S";
	public ShoppingPayment(double balance, int customerId) {
		super(balance,customerId);
		counter++;
	}
	@Override
	public void payBill(double amount) {
		if (this.getBalance()==amount) {
			System.out.println(this.paymentId=paymentId.concat(String.valueOf(counter)));
			System.out.println("Transaction Sucessfull");
		}
		else if(this.getBalance()<amount)
			System.out.println("Insufficient amount Entered!!! please try again later");
		else if(this.getBalance()>amount)
			System.out.println("Excess amount Entered!!! please try again later");
	}
}
