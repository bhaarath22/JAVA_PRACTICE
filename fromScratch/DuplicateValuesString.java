package fromScratch;
import java.util.HashSet;
import java.util.Set;






public class DuplicateValuesString {
	public static void main(String[] args) {
		String[] duplicates = { "vamshi","ajay","rahul","vishnu","satwhik","rahul"};
		
		Set<String> uniqueSet = new HashSet<>();
		
		Set<String> duplicateSet = new HashSet<>();
		
		for(String str : duplicates) {
			if( !uniqueSet.add(str)) {
				duplicateSet.add(str);
				
			}
		}
System.out.println( "duplicate values in the array are:"+duplicateSet);
		}
}