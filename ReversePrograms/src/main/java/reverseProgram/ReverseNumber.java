package reverseProgram;

public class ReverseNumber {	
	public int reverseNumber(int num) {
		int copyNum = num;
		int digits, reversedNum =0;
		while(num>0) {
			digits = num%10;
			reversedNum = reversedNum*10+digits;
			num= num/10;
		}	
		return reversedNum;
	}	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		int num = 1214;
		System.out.println("Reverse of "+num+" = "+obj.reverseNumber(num));
	}
}
