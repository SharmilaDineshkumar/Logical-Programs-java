
class Parent
{
	void display()
	{
		System.out.println("calling from parent class");
	}
}
public class Overriding extends Parent{

	void display()
	{
		System.out.println("calling from sub class");
	}
	public static void main(String[] args) {
		Parent p=new Overriding();
		p.display();
	}
}
