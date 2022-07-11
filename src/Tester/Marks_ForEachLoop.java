package Tester;

public class Marks_ForEachLoop {
	public int[] marks=new int[5];

	public void storeMarks(int sub1,int sub2,int sub3,int sub4,int sub5) {
		marks[0]=sub1;
		marks[1]=sub2;
		marks[2]=sub3;
		marks[3]=sub4;
		marks[4]=sub5;
	}
	int k=1;
	public void displayMarks() {
		for(int i: marks) {

			System.out.println("Subject "+k+" : "+i);
			++k;
		}
	}
	public static void main(String[] args) {
		Marks_ForEachLoop marks_ForEachLoop=new Marks_ForEachLoop();
		marks_ForEachLoop.storeMarks(80, 75, 99, 100, 100);
		marks_ForEachLoop.displayMarks();
	}

}
