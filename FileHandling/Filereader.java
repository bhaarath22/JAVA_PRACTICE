package FileHandling;
import java.io.*;
public class Filereader {
	public static void main(String[] args) {
		try {
			File f1= new File("iambatman");
			BufferedReader r1= new BufferedReader(new FileReader(f1));
			String text;
			while((text=r1.readLine())!=null) {
				System.out.println(text);
			}
			r1.close();
			//f1.close();
			
		}
		catch(IOException e) {
	e.printStackTrace();
		}
	}

}
