package Salary_Inheritance;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public double calculateSalary() {
		return 0;}

}
