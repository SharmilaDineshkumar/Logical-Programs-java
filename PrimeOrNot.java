package test.string.common;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check : ");
		int num=s.nextInt();
		if(num<0)
			System.out.println("Enter a valid number");
		else if(num==0 || num==1)
			System.out.println("not a prime number");
		else
		{
			if(((num*num) - 1)%24==0)
				System.out.println("prime number");
			else
				System.out.println("not a prime number");
		}
	}

}
