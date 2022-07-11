package DataProvider;

public class Intern implements DataProvider{
	private int markedSecured;
	private int graceMarks;

	public int getMarkedSecured() {
		return markedSecured;
	}
	public int getGraceMarks() {
		return graceMarks;
	}

	public Intern(int markedSecured, int graceMarks) {
		super();
		this.markedSecured = markedSecured;
		this.graceMarks = graceMarks;
	}
	@Override
	public void calcPercentage() {
		int totalMarks=(this.getGraceMarks()+this.getMarkedSecured());
		if (totalMarks>0 && totalMarks<=8000) {
			Float avg = (float)totalMarks/80;
			System.out.println("The Total Aggregate Percentage = "+avg);
		}
		else {
			System.out.println("Please enter correct marks");
		}
	}

}