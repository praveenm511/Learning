package Tester;

public class LuckyNumber {
	public long luckyNumber(int number) {
		int i=0;
		long luckyNumber=0;
		int num=number;
		while(num>0){
			num/=10;
			i++;
		}
		int[] individualNumbers=new int[i];
		--i;
		while(number>0) {
			int singleDigit=number%10;
			individualNumbers[i]=singleDigit;
			number/=10;
			--i;
		}
		int l=1;
		int length=individualNumbers.length-1;
		while(l<=length) {
			luckyNumber+=Math.pow(individualNumbers[l], 2);
			l+=2;
		}
		return luckyNumber;
	}
	public static void main(String[] args) {
		LuckyNumber testApp=new LuckyNumber();
		System.out.println(testApp.luckyNumber(12345678));
	}

}