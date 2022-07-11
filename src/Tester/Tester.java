package Tester;

public class Tester {   
	public static void main(String[] args){
		try {
			System.out.println("10/5 = "+10/5);
			System.out.println("10/0 = "+10/0);
			System.out.println("100/5 = "+100/5);
			System.out.println("100/10 = "+100/10);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}