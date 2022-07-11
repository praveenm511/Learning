package Tester;

public class Registration{
	private String customerName;
	private String pancard;
	private int voterId;
	private String passportNo;
	private int licensenNo;
	private long[]telephoneNo;


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public int getLicensenNo() {
		return licensenNo;
	}
	public void setLicensenNo(int licensenNo) {
		this.licensenNo = licensenNo;
	}
	public long[] getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(long[] telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public Registration(String customerName, String passportNo, long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.passportNo = passportNo;
		this.telephoneNo = telephoneNo;
		System.out.println("Congratulations "+customerName+" you have been successfully registered for our services with the following details:");
		System.out.println("Passport number: "+passportNo);
		System.out.print("Phone numbers: ");
		System.out.print(telephoneNo[0]+",");
		System.out.println(telephoneNo[0]);
	}
	public Registration(String customerName, String pancard, int voterId, long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.pancard = pancard;
		this.voterId = voterId;
		this.telephoneNo = telephoneNo;
	}
	public Registration(String customerName, int licensenNo, String pancard, long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.licensenNo = licensenNo;
		this.pancard = pancard;
		this.telephoneNo = telephoneNo;
	}
	public Registration(String customerName, int voterId, int licensenNo, long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.voterId = voterId;
		this.licensenNo = licensenNo;
		this.telephoneNo = telephoneNo;
	}
	public static void main(String[] args) {
		long[] kevinPH= {9452425421l,7676765252l};
		Registration kevin=new Registration("Kevin", "MN9891N", kevinPH);
	}

}