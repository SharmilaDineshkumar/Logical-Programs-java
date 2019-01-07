package test.pattern;

import java.util.Scanner;

public class LetterInDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] letter_array= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int letter_index=0;
		String[] diamond=new String[26];
		System.out.println("Enter a letter between A - Z : ");
		Scanner sc=new Scanner(System.in);
		char letter=sc.next("[A-Z]").charAt(0);
		for(int i=0;i<letter_array.length;i++)
		{
			if(letter_array[i]==letter)
			{
				letter_index=i;
				break;
			}
		}
		
		for(int i=0;i<=letter_index;i++)
		{
			diamond[i]="";
			for(int j=i;j<letter_index;j++)
			{
				diamond[i]+=" ";
			}
			diamond[i]+=letter_array[i];
			if(letter_array[i]!='A')
			{
			for(int j=0;j<2*i-1;j++)
			{
				diamond[i]+=" ";
			}
			diamond[i]+=letter_array[i];
			}
			System.out.println(diamond[i]);
		}
		for(int i=letter_index-2;i>=0;i--)
		{
			System.out.println(diamond[i]);
		}
	}

}
