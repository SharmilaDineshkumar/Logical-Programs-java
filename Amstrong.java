package test.string.common;

import java.util.Scanner;

public class Amstrong {
public static void main(String args[])
{
	System.out.println("Enter a number : ");
	Scanner s=new Scanner(System.in);
	int ams=s.nextInt();
	if(isAmstrong(ams))
		System.out.println(ams+" is a Amstrong number");
	else
		System.out.println(ams+" is not a Amstrong number");
	
}
	static boolean isAmstrong(int num)
	{
		int ams=num,cube=0;
		while(ams!=0)
		{
			int rem=ams%10;
			cube=cube+(rem*rem*rem);
			ams=ams/10;
		}
		if(num==cube)
			return true;
		else
			return false;
	}
}
