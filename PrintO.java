package test.pattern;

public class PrintO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] printo=new String[7][7];
for(int i=0;i<7;i++)
{
	
	for(int j=0;j<7;j++)
	{
		/*System.out.println("printo.length : "+printo.length);
		System.out.println("printo.length[i] : "+printo[j].length);*/
		
		
		if((i==0 && j==0) || (i==(printo.length-1) && j==(printo[i].length-1)) || (i==0 && j==(printo[i].length-1)) || (j==0 && i==(printo[i].length-1)))
		{
			System.out.print("   ");
		}
		else
			System.out.print(i+""+j+" ");
	}
	System.out.println("");
}

	}

}
