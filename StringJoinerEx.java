import java.util.StringJoiner;  
public class StringJoinerEx {  
    public static void main(String[] args) {  
  
        StringJoiner joinNames = new StringJoiner(",", "{", "}");      
          
        // Adding values to StringJoiner 1 
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
  
       
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");     
          
        // Adding values to StringJoiner 2 
        joinNames2.add("Peter");  
        joinNames2.add("Raheem");  
  
        // Merging two StringJoiner  
        StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);
        
        //convert to string literal
        String mystring=merge.toString();
        System.out.println("after converting to string : "+mystring);
        
        //converting to chararray
        char []carr=mystring.toCharArray();
        System.out.println("character at 4th position : "+carr[4]);
    }  
}  

