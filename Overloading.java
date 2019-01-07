
public class Overloading {

	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		
		Overloading o=new Overloading();
		System.out.println(o.add(10, 10));
		System.out.println(o.add(10, 10, 10));
	}

}
