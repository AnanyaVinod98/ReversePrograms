package reverseProgram;

public class ReverseString {
	public String reverseString(String str) {
		String reversedString = "";
		String strCopy = str;
		for(int i=0;i<str.length();i++) {
			reversedString = str.charAt(i)+reversedString;
		}
		return reversedString;
	}
	public static void main(String[] args) {
		String str = "HELLO";
		ReverseString obj = new ReverseString();
		System.out.println("Reverse of "+str+" = "+obj.reverseString(str));
	}
}
