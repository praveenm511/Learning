package Tester;

abstract class Bank {

  private String bankName;

  Bank(String bankName) {
	this.bankName = bankName;
  }

public String getBankName() {
	return bankName;
}
}

public class DelhiOffice extends Bank {

DelhiOffice() {
	super("Axis Bank");
}

public static void main(String[] args) {
	Bank bank = new DelhiOffice();
	System.out.println(bank.getBankName());
}

}