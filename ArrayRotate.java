import java.util.ArrayList;
import java.util.List;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int rot=4;
		int b[]=rotatearray(a,rot);
		
for(int i=0;i<b.length;i++)
{
	System.out.print(" "+b[i]);
}
	}

	private static int[] rotatearray(int a[], int rot) {
		//int[] b=new int[a.length];
		int num=0;
		while(num<rot)
		{
			int temp= a[0],i;
		
		for(i=0;i<a.length-1;i++)
		{
			
			a[i]=a[i+1];
			System.out.println("i= "+i+"   a[i] = "+a[i]);
		}
		a[i]=temp;
		num++;
		System.out.println("i= "+i+"   a[i] = "+a[i]);
		}
		return a;
	}

}
