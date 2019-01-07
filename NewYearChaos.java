import java.util.Scanner;

public class NewYearChaos {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int row=s.nextInt();
		
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter number of members in a row :");
			int members=s.nextInt();
			int[] que=new int[members];
			for(int j=0;j<members;j++)
			{
				que[j]=s.nextInt();
			}
			minimumBribes(que);
			
		}

	}

	private static void minimumBribes(int[] q)
	{
		for(int i = q.length-1; i >=0; i--)
        {
            if(q[i]-1-i > 2)
            {    
            	System.out.println("q[i] : "+q[i]+"  i="+i);
            System.out.println("Too chatoic");
            return;
            }
        }
		//sort to find swaps
		int swap=0;
		for(int i=0;i<q.length;i++)
		{
			for(int j=0;j<q.length-1;j++)
			{
				if(q[j]>q[j+1])
				{
					swap++;
					int temp=q[j+1];
					q[j+1]=q[j];
					q[j]=temp;
				}
			}
		}
		System.out.println("swaps : "+swap);
	}
}
