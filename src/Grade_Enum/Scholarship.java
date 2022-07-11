package Grade_Enum;

public class Scholarship {
	private int studentId;
	private String name;
	private Grade grade;
	private int scholarshipAmount;
	private int totalMarks;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public int getScholarshipAmount() {
		return scholarshipAmount;
	}
	public void setScholarshipAmount(int scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	} 

	public void calculateGrade( )  {                                                                                          
		if ( totalMarks>=250 )                                                                                       
			this.grade = Grade.A;                                                                                                            
		else  if( totalMarks>=200  &&  totalMarks<250)                          
			this.grade = Grade.B ;                                                                                                            
		else  if( totalMarks>=175  &&  totalMarks<200)                           
			this.grade = Grade.C ;                                                                                                            
		else  if( totalMarks>=150  &&  totalMarks<175)                            
			this.grade =Grade.D ;                                                                                                            
		else                                                                                                                                  
			this.grade = Grade.E ;                                                                                                             
	}

	public void calculateScholarshipAmount () {
		switch (this.grade) {
		case A:
			scholarshipAmount = 5000;
			break;
		case B:
			scholarshipAmount = 4000;
			break;
		case C:
			scholarshipAmount = 3000;
			break;
		case D:
			scholarshipAmount = 2000;
			break;
		default:
			scholarshipAmount = 0;
		}
	}

	public static void main(String[] args) {
		Scholarship s1=new Scholarship();
		s1.setStudentId(1000);
		s1.setName("alvin");
		s1.setTotalMarks (280);
		s1.calculateGrade();
		s1.calculateScholarshipAmount();
		System.out.println("Student Details");
		System.out.println("Student Id: "+s1.getStudentId());
		System.out.println("Student Name: "+s1.getName());
		System.out.println("Student Grade: "+s1.getGrade());
		System.out.println("Scholarship amount:" +s1.getScholarshipAmount());
	}
}