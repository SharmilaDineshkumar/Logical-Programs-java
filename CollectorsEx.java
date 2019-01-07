import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String name;
	int id;
	int marks;
public Student(int id,String name,int marks)
{
	this.id=id;
	this.name=name;
	this.marks=marks;
}
}
public class CollectorsEx {
public static void main(String args[])
{
	List<Student> list=new ArrayList<Student>();
	list.add(new Student(1001,"Sharmila",450));
	list.add(new Student(1003,"Mahesh",460));
	list.add(new Student(1002,"Dinesh",465));
	list.add(new Student(1004,"Anitha",455));
	
	//fetching data as list
	
	List<String> stud_names=list.stream().map(x->x.name).collect(Collectors.toList());
	//iterating list
	stud_names.forEach(System.out::println);
	
	//sum marks
	int marks=list.stream().collect(Collectors.summingInt(x->x.marks));
	System.out.println("toatal marks : "+marks);
	
	//count no.of.students
	long count=list.stream().collect(Collectors.counting());
	System.out.println("Number of students : "+count);
}
}
