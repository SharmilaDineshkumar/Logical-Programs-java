package test.string.common;

public class Palindrome {
public static void main(String args[]) {
	StringBuilder str=new StringBuilder("vigadagavi");
	System.out.println(str);
	String reverseStr=str.reverse().toString();
	if(str.equals(reverseStr))
	{
		System.out.println(str+" is palindrome");
	}
	else
	{
		System.out.println(str+" is not palindrome");
	}
}
}
