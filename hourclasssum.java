import java.io.*;
import java.util.Scanner;
public class hourclasssum {
	
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println("result : "+result);

	}

	private static int hourglassSum(int[][] arr) {
		int max=-64;
		
		 for(int i=0;i<4;i++)
	        {
	            for(int j=0;j<4;j++)
	            {
	            	System.out.println("i= "+i+"  j="+j);
	            	int sum=0;
	            	sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
	            	
	            	if(sum>max)
	            		max=sum;
	            	System.out.println("max = "+max);
	            }
	        }

		return max;
	}

}
