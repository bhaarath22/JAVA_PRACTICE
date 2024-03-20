package OOP;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main (String[] args)  {
	try {
		FileWriter writer =new FileWriter("iambatman");
		
		writer.write("\n we can piCk ourselves up\nI AM VENGEANCE\n ");
		writer.append("\n ITS NOT WHO YOU ARE UNDERNEATH \n ITS WHAT YOU DO THAT DEFINES YOU!") ;
				writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
