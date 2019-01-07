package test.string.common;
import java.util.Scanner;

public class Fibonacci {
public static void main(String args[]) {
	int a=1;
	int b=1;
	int c=1;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the limit : ");
	int limit=s.nextInt();
	System.out.println("Fibonacci series : ");//1 1 2 3 5 8 13...
	
	System.out.println(b);
	while(c<=limit)
	{
		System.out.println(c);
		c=a+b;
		a=b;
		b=c;
		
	}s.close();
}
}
