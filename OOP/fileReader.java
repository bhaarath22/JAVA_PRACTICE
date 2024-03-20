package OOP;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//FileReader = read the contents o a tile as a stream o characters. One by one
//read() returns an //int value which contains the byte value when read() returns -1, there is no more data to be read
public class fileReader {
	public static void main(String[] args) {
		
		
			
				
					
					try {
						FileReader reader1 = new FileReader("/Users/bharathgoud/eclipse-workspace/example/src/OOP/bat.txt");
						int data = reader1. read () ;
						while(data != -1) {
						System.out.print( (char)data);
						data = reader1. read() ;
						}
						reader1.close ();
						
						} catch (FileNotFoundException e) {
				
						// TODO Auto-generated catch block
						
						e.printStackTrace ( ) ;
						
						} catch (IOException e) {
	
			
							e.printStackTrace ( ) ;
							}
			}}
			
			
			
			
			
							
			
			