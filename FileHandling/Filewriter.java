package FileHandling;
import java.io.*;
public class Filewriter {
	public static void main(String[] args) {
		try {
			
			File f1= new File("HanuMan");
			String text ="hanuman is verypowerful /n he can jump to long placess";
			FileWriter f2 =new FileWriter(f1);
			f2.write(text);
			f2.close();
			//f1.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
