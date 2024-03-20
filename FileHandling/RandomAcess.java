package FileHandling;
import java.io.*;
import java.io.RandomAccessFile;
public class RandomAcess {
static  final String Filepath="iambatman";
public static void main(String[] args) {
	try {
		System.out.println(new String(readFileFrom(Filepath,0,18)));
		writeToFile(Filepath,"i am vegitarian",34);
	}
	catch(Exception e) {
     e.printStackTrace();
	}
}
	
	
	public static byte[] readFileFrom(String FILEPATH,int position,int size) throws IOException{
		
		RandomAccessFile file = new RandomAccessFile(FILEPATH,"r");
file.seek(position);
byte[] bytes=new byte[size];
file.read(bytes);
file.close();
return bytes;
		
	}
	private static void writeToFile(String filePath, String data, int position)
			throws IOException {
			RandomAccessFile file = new RandomAccessFile(filePath, "rw"); file.seek(position);
			file.write(data.getBytes());
			file.close();
	
	
}
}
