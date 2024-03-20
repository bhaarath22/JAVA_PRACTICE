package practiceScratch;
import java.util.ArrayList;
public class ForEach {
public static void main(String[] args) {
	//String[] animals= {  "dog","cat","lion","cheetha"};
	
	ArrayList<String> animals = new ArrayList<String>() ;
	
	animals.add("lion");
	animals.add("cheetha");
	animals.add("tigher");
	animals.add("dinossor");
	
	for(String i : animals) {
		System.out.println(i);
}}
	
}

// for-each: is traversing technique for iterating through the element in an array/collection
// less felxible , les steeps ,more readable
// : represents the word "of"