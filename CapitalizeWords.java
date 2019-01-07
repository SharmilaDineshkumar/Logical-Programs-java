
public class CapitalizeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String myString="test string";
System.out.println("Before : "+myString);
String words[]=myString.split(" ");
String capitalize="";
for(String str:words) {
	String firstLetter=str.substring(0, 1);
	String restLetters=str.substring(1);
	capitalize+=firstLetter.toUpperCase()+restLetters+" ";
}
System.out.println("After : "+capitalize);
	}

}
