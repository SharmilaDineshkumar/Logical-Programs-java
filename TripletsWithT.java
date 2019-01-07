package test.pattern;

import java.util.Scanner;

public class TripletsWithT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the threshold value");
		int t=s.nextInt();
		System.out.println("Enter the number of values");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the values");
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		calculateTriplet(arr,n,t);
		s.close();

	}

	private static void calculateTriplet(int[] arr, int n, int t) {
		int triplet=0;
		 for(int i = 0; i < arr.length; i++){
	            for(int j = i; j < arr.length ;j++){
	                for(int k = j; k<arr.length;k++){
	                	if(i != j && j != k && i != k && (arr[i]+arr[j]+arr[k])<=t)
	                	{
	                		System.out.println("triplet array : ["+arr[i]+","+arr[j]+","+arr[k]+"]");
	                		triplet++;
	                	}
	                }
	            }
	                }
		System.out.println("number of triplets : "+triplet);
		
	}

}
