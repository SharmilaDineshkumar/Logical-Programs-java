import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class CloudJumbing {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumbs=0,i=0;
       outer:
        while(i<c.length)
        {
            if((i+1)!=c.length && c[i+1]==0)
            {
                if((i+2)!=c.length && c[i+2]==0)
                {
                 jumbs++;
                 i=i+2;
                // System.out.println("i : "+i);
                 continue outer;
                }
            jumbs++;
            i=i+1;
            
//System.out.println("i : "+i);
continue outer;
            }
               
            else if((i+1)!=c.length && c[i+1]==1)
            {
                if((i+2)!=c.length && c[i+2]==0)
                {
                 jumbs++;
                 i=i+2;
                 //System.out.println("i : "+i);
                 continue outer;
                }
           
            }
            i++;
        }
return jumbs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
System.out.println("no.of clouds : ");
        int n = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//System.out.println("cloud pattern :");
        int[] c = {0,0,0,0,1,0};


        int result = jumpingOnClouds(c);

       System.out.println("result: "+result);
        scanner.close();
    }
}

