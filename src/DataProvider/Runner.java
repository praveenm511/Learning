package DataProvider;

public class Runner {

	public static void main(String[] args) {
		Intern intern1=new Intern(5000,500);
		Intern intern2=new Intern(8000,500);
		Trainee trainee1=new Trainee(6000);
		intern1.calcPercentage();
		intern2.calcPercentage();
		trainee1.calcPercentage();
	}

}
