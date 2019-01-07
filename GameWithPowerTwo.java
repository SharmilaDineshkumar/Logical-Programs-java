package test.pattern;

import java.util.Scanner;

public class GameWithPowerTwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the counter value : ");
		int count=s.nextInt();
		findWinner(count);

	}

	private static void findWinner(int count) {
		String winner="Luice";int it=0;
		if(count==0)
			System.out.println("invalid input");
		else if(count==1)
			System.out.println("Luice");
		else
		{
			while(count>1)
			{
				if((count & (count - 1)) == 0)
				{
					count=count/2;
					it++;
				}
				else
				{
					for (int i = count; i >= 1; i--) 
			        { 
			         // If i is a power of 2 
			          if ((i & (i - 1)) == 0) 
			             { 
			                  count = count-i; 
			                  it++;
			                break; 
			             } 
			        } 
					
				}
			}
		}
		if(it%2 == 0)
			System.out.println("Richard");
		else
			System.out.println("Luice");
	}

}
