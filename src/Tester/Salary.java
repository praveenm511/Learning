package Tester;

public class Salary {
	public double averageSalery(double[] salary) {
		int length=salary.length;
		double totalSalary=0;
		for(double individualSalary: salary) {
			totalSalary+=individualSalary;
		}
		return totalSalary/length;
	}

	public int greaterThanAverageSalary(double[] salary) {
		double averageSalary= this.averageSalery(salary);
		int i=0;
		for(double individualSalary: salary) {
			if(averageSalary<individualSalary)
				i++;
		}
		return i;
	}
	
	public int lessThanAverageSalary(double[] salary) {
		double averageSalary= this.averageSalery(salary);
		int i=0;
		for(double individualSalary: salary) {
			if(averageSalary>individualSalary)
				i++;
		}
		return i;
	}

	public static void main(String[] args) {
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		Salary salaryobj=new Salary();
		System.out.println(salaryobj.averageSalery(salary));
		System.out.println(salaryobj.greaterThanAverageSalary(salary));
		System.out.println(salaryobj.lessThanAverageSalary(salary));

	}

}
