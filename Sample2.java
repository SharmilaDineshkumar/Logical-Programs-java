
class Student
{
	int id;
	String name;
	static String clg;
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
	static
	{
		clg="CCET";
	}
	void display()
	{
		System.out.println("id : "+id+" name: "+name+" college : "+clg);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		Student s=new Student(100, "Sharmila");
		Student s1=new Student(101, "Anitha");
		s.display();
		s1.display();
	}

}
