
public class EqualsVSEqualto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("abc");
		String s2=new String("abc");
		String s3=new String("def");
		String s4="abc";
		String s5="abc";
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s4.equals(s5) : "+s4.equals(s5));
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		System.out.println("s4==s5 : "+(s4==s5));
	}

}
