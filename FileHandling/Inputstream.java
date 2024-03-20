package FileHandling;
import java.io.FileInputStream;
public class Inputstream {
public static void main(String[] args) {
	try{FileInputStream f1= new FileInputStream("iambatman");
	// int i= f1.read();// reads only 1st letter
	int i=0;
	while((i=f1.read())!=-1) {
System.out.println((char)i);}
f1.close();
	}

catch(Exception e) {
	System.out.println(e);
}
}}
