package FileHandling;
import java.io.*;
public class Bufferedwriter {
public static void main(String[] args)throws Exception {
	FileWriter f1= new FileWriter("iambatman");
	BufferedWriter b1= new BufferedWriter(f1);
	b1.write("i am vegenice");
	b1.close();
	System.out.println("sucess");
	
	FileReader f2= new FileReader("iambatman");
	BufferedReader b2= new BufferedReader(f2);
	int i;
	while((i=b2.read())!=-1) {
		System.out.println((char)i);
	}
	System.out.println("sucess");

f1.close();
b1.close();
}
}
