
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton ms1=MySingleton.getInstance();
		MySingleton ms2=MySingleton.getInstance();
		System.out.println("calling by ms1 : "+ms1.msg);
		ms2.msg=ms2.msg.toUpperCase();
		System.out.println("calling by ms2 with touppercase(): "+ms2.msg);
		System.out.println("after touppercase() calling by ms1 : "+ms1.msg);
	}

}
class MySingleton
{
	private static MySingleton singleton=null;
	
	public String msg;
	private MySingleton()
	{
		msg="My Sigleton class";
	}
	public static MySingleton getInstance() {
		if(singleton==null)
		{
			singleton=new MySingleton();
		}
		return singleton;
	}
}
