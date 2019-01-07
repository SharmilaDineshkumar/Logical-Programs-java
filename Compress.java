package test.thread;

import java.io.*;  
import java.util.zip.*;  
class Compress{  
public static void main(String args[]){  
try{  
FileInputStream fin=new FileInputStream("Deflater.txt");  
FileOutputStream fout=new FileOutputStream("def.txt");  
DeflaterOutputStream out=new DeflaterOutputStream(fout);  
  
int i;  
while((i=fin.read())!=-1){  
out.write((byte)i);  
out.flush();  
}  
fin.close();  
out.close();  
}catch(Exception e){System.out.println(e);}  
System.out.println("rest of the code");  
	
	 /*try {  
         File file = new File("javaFile123.txt");  
         if (file.createNewFile()) {  
             System.out.println("New File is created!");  
         } else {  
             System.out.println("File already exists.");  
         }  
     } catch (IOException e) {  
         e.printStackTrace();  
     }  */
}  
}  
