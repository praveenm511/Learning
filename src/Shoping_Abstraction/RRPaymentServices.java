package Shoping_Abstraction;

public abstract class RRPaymentServices {
	private double balance;
	private int customerId;
	public RRPaymentServices(double balance, int customerId) {
		super();
		this.balance = balance;
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public int getCustomerId() {
		return customerId;
	}

	public abstract void payBill(double amount);
}
