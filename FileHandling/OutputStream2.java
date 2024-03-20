package FileHandling;
import java.io.*;
import java.io.FileOutputStream;
public class OutputStream2 {
	public static void main(String[] args) {
		try {
			FileOutputStream f1= new FileOutputStream("iambatman");
			String s="fucking good movies";
			byte b[]=  s.getBytes();//converts string into bytes
			f1.write(b);
			f1.close();
			System.out.println("sucess");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
