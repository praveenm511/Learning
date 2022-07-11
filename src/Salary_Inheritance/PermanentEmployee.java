package Salary_Inheritance;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private int experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public PermanentEmployee(int empId, String name, double basicPay, double hra, int experience) {
		super(empId, name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	public double calculateSalary() {
		double variableComponent=0;
		if(this.experience<3)
			variableComponent=0;
		else if(this.experience<5)
			variableComponent=0.05*this.basicPay;
		else if(this.experience<10)
			variableComponent=0.07*this.basicPay;
		else if(this.experience>=10)
			variableComponent=0.12*this.basicPay;

		double Salary = variableComponent + this.basicPay +this.hra;
		return Salary;
	}
}
