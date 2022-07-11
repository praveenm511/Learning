package Shoping_Abstraction;

public class CreditCardPayment extends RRPaymentServices{
	private static int counter=1000;
	private String paymentId="C";
	private double cashBack=0.0;
	private double balanceDue=0.0;
	public CreditCardPayment(double balance, int customerId) {
		super(balance, customerId);
		counter++;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public double getCashBack() {
		return cashBack;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	@Override
	public void payBill(double amount) {
				System.out.println("Customer Id = "+this.getCustomerId());
				System.out.print("Payment Id = ");
				System.out.println(this.paymentId=paymentId.concat(String.valueOf(counter)));
				System.out.println("Previous Balance = "+this.getBalance());
		if (this.getBalance()>=amount)
			this.cashBack=this.getBalance()-amount;
		else {
			this.balanceDue=amount-this.getBalance();
		}
		System.out.println("Remaining Due = "+this.balanceDue);
		System.out.println("CashBack Wallet Ballence = "+this.cashBack);
	}
}
