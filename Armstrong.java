package test.string.common;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter your value : ");
		Scanner sr=new Scanner(System.in);
		int val=sr.nextInt();
		int div=val,rem=0,cub=0;
		while(val>0)
		{
			rem=val%10;
			cub+=rem*rem*rem;
			val=val/10;
		}
		if(cub==div)
			System.out.println("Armstrong Number");
		else
			System.out.println("not a Armstrong Number");
	}
}
