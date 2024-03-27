package reverseProgram;

import java.util.Scanner;

public class Palindrome {
	public Boolean isPalindrome(int num) {
		int copyNum = num;
		int digits, reversedNum =0;
		while(num>0) {
			digits = num%10;
			reversedNum = reversedNum*10+digits;
			num= num/10;
		}	
		if(copyNum == reversedNum) {
			return true;
		}
		else {
			return false;
		}
	}	
	public Boolean isPalindrome(String str) {
		String reversedString = "";
		for(int i=0;i<str.length();i++) {
			reversedString = str.charAt(i)+reversedString;
		}
		if(str.equals(reversedString)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]){
		int num = 1234;
		String str = "LEVEL";
		
		Palindrome obj = new Palindrome();
		System.out.println("Is "+num+" a palindrome = "+obj.isPalindrome(num));
		System.out.println("Is "+str+" a palindrome = "+obj.isPalindrome(str));
	}
}
