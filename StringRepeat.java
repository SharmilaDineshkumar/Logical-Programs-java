import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringRepeat {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] arr1=s.toCharArray();
        int size=(int)n;
        char[] arr2=new char[size];
        int occurense=0;
        for(int i=0,j=0;i<n;i++)
        {
            if(j==arr1.length)
            {
                j=0;
                arr2[i]=arr1[j];
                j++;
            }
            else
            {
                arr2[i]=arr1[j];
                j++;
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]=='a')
                occurense++;
        }
return occurense;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/
    	String s="ab";
    	long n=10;

        long result = repeatedString(s, n);

        System.out.println("result : "+result);
        scanner.close();
    }
}

