package Tester;

public class ArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber testApp=new ArmstrongNumber();
		System.out.println(testApp.armstrongNumber(12456));
	}

	public long armstrongNumber(int number) {
		int i=0;
		long armstrongNumber=0;
		int num=number;
		while(num>0){
			num/=10;
			i++;
		}
		int[] individualNumbers=new int[i];
		int j=0;
		while(number>0) {
			int singleDigit=number%10;
			individualNumbers[j++]=singleDigit;
			number/=10;
		}
		for (int individualNumber : individualNumbers) {
			armstrongNumber+=Math.pow(individualNumber, individualNumbers.length);
		}
		return armstrongNumber;
	}
}