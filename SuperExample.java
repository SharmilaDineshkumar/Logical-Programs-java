class SuperParent
{
	int a=10;
	SuperParent()
	{
		System.out.println("Parent class Constructor");
	}
	void display()
	{
		System.out.println("parent class method");
		
	}
}
public class SuperExample extends SuperParent{

	int a=15;
	public SuperExample() {
		super();
		System.out.println("sub class constructor");
		System.out.println("parent class variable : "+super.a);
		System.out.println("sub class variable : "+this.a);
		super.display();
	}
	public static void main(String[] args) {
		SuperExample s=new SuperExample();
		

	}

}
