package test.string.common;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a number : ");
Scanner s=new Scanner(System.in);
int num=s.nextInt();
if(isPalindrome(num))
	System.out.println(num+" is palindrome");
else
	System.out.println(num+" is not a palindrome");
	}
static boolean isPalindrome(int num)
{
	int revNum=0,remainder,input=num;
	while(num!=0)
	{
		remainder=num%10;
		revNum=revNum*10+remainder;
		num=num/10;
	}
	
	if(input==revNum)
		return true;
	else
		return false;
}
}
