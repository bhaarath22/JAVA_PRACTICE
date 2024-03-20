package FileHandling;
import java.io.*;
public class Filewriter3 {
public static void main(String[] args) throws Exception{
try {	FileWriter f1= new FileWriter("iambatman");

f1.write("i am batman");
f1.write("i am 19");
f1.write("i work in nights & i stay in dark");
f1.close();

}
catch(FileNotFoundException e){
	System.out.println(e);
	
}

try {
	FileReader r1= new FileReader("iambatman");
	int i;
	while((i=r1.read())!=-1) {
		System.out.println((char)i);
	}
}
finally{
	System.out.println("fucking good movies");
}
}
}
