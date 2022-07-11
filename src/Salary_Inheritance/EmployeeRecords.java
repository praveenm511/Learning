package Salary_Inheritance;

public class EmployeeRecords {

	public static void main(String[] args) {
		PermanentEmployee permanentEmployee=new PermanentEmployee(101,"Anil",10000,1500,3);
		ContractEmployee contractEmployee=new ContractEmployee(102,"102",500, 10);
		System.out.println(permanentEmployee.calculateSalary());
		System.out.println(contractEmployee.calculateSalary());
	}

}
