package DataProvider;

public class Trainee implements DataProvider{
	private int marksSecured;

	public int getMarksSecured() {
		return marksSecured;
	}

	public Trainee(int marksSecured) {
		super();
		this.marksSecured = marksSecured;
	}

	@Override
	public void calcPercentage() {
		int totalMarks=this.getMarksSecured();
		if (totalMarks>0 && totalMarks<=8000) {
			Float avg = (float)totalMarks/80;
			System.out.println("The Total Aggregate Percentage = "+avg);
		}
		else {
			System.out.println("Please enter correct marks");
		}
	}
}
