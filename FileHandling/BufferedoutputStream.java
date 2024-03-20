package FileHandling;
import java.io.*;
public class BufferedoutputStream {
public static void main(String[] args) throws Exception {
	FileOutputStream f1= new FileOutputStream("iambatman");
	BufferedOutputStream b1= new BufferedOutputStream(f1);
	String s= "welcome to my world";
	byte b[]=s.getBytes();
	b1.write(b);
	b1.flush();
	b1.close();
	f1.close();
	System.out.println("success");
}
}
