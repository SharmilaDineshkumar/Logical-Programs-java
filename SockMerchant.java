import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pair=0;
        System.out.println("arr length"+ar.length);
        for(int i=0;i<ar.length;i++)
        {
        	inner:
            for(int j=i+1;j<ar.length;j++)
            {
            	
                if(ar[i]==ar[j])
                {
                	ar=removeElement(ar, j);
                    pair++;
                    System.out.println("i="+i+"  j="+j);
                    break inner;
                }
                    
            }
        }
        return pair;

    }
    static int[] removeElement(int[] arr, int index)
    {
    	int[] arr1=new int[arr.length - 1];
    	if (arr == null
                || index < 0
                || index >= arr.length) { 
      
                return arr; 
            } 
    	for(int i=0,k=0;i<arr.length;i++)
    	{
    		if(i==index)
    			continue;
    		System.out.println("i= "+i+"**** k= "+k);
    			arr1[k++]=arr[i];
    	}
    	return arr1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int n = scanner.nextInt();
       
        int[] ar = new int[n];

        
        

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
           
        }
        for (int i = 0; i < n; i++) {
        	 System.out.println("ar : "+ar[i]);
        }
        
        System.out.println("n : "+n);
       
System.out.println("calling sockMerchant");
        int result = sockMerchant(n, ar);

        System.out.println("result : "+result);

        scanner.close();
    }
}


