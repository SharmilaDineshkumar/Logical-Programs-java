package test.string.common;

import java.util.Scanner;

public class PalindromeWOCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String to check : ");
		String str=s.next();
		char[] carr=str.toCharArray();
		char[] carr2 = new char[carr.length];
		for(int i=carr.length-1,j=0;i>=0;i--,j++)
		{
			carr2[j]=carr[i];
		}
		
		String str2=String.valueOf(carr2);
		System.out.println(str);
		System.out.println(str2);
			if(str.equals(str2))
			{
				System.out.println(str+" is palindrome");
			}
			else
				System.out.println(str+" is not a palindrome");
		}

}
