package FileHandling;
import java.io.*;
public class OutputStream {
public static void main(String[] args) {
	try {
		FileOutputStream f1= new FileOutputStream("iambatman");
		f1.write(65);
		f1.close();
		System.out.println("success");
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
