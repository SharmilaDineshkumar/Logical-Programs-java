
public class ThisExample {

	int a=15,b=15;
	
	void add(int a,int b)
	{
		System.out.println("this.a : "+this.a);
		System.out.println("this.b : "+this.b);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		//return a;
	}
	void display()
	{
		this.add(10, 10);
	}
	public static void main(String[] args) {
		ThisExample t=new ThisExample();
		t.display();
	}

}
