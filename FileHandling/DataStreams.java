package FileHandling;
import java.io.*;
public class DataStreams {
public static void main(String[] args)throws Exception {
	DataOutputStream d1 = new DataOutputStream(new FileOutputStream("iambatman"));
	{
		d1.writeDouble(1.2);
		d1.writeLong(30);
		d1.writeInt(2);
		d1.writeChar('c');
		d1.writeBoolean(true);
	}
	DataInputStream d2=new DataInputStream(new FileInputStream("iambatman"));
	{
		double a= d2.readDouble();
		long b= d2.readLong();
		int c= d2.readInt();
		char d= d2.readChar();
		boolean e =d2.readBoolean();
		System.out.println(a+"\n" +b+"\n"+c+"\n"+d+"\n"+e);
	}
}
}
