package practiceScratch;
import java.util. *;
//import java.util.ArrayList;

public class ArrayList2Ds {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> menu= new ArrayList<ArrayList<String>>();
		
		
		
		ArrayList<String> tiffins = new ArrayList<String>();
		tiffins.add("dosa");
		tiffins.add("idly");
		tiffins.add("vada");
		
		menu.add(tiffins);
		
		ArrayList<String> lunch = new ArrayList<String>();
		lunch.add("rice");
		lunch.add("dal");
		lunch.add("sambar");
		lunch.add("curd");
		
		menu.add(lunch);
		
		ArrayList<String> snacks = new ArrayList<String>();
		snacks.add("pappuchaka");
		snacks.add("masala idly");
		snacks.add("karapusa");
		
		menu.add(snacks);
		
		ArrayList<String> dinner = new ArrayList<String>();
		dinner.add("chapathi");
		dinner.add("paneer ");
		dinner.add("gulab jamoon");
		
		menu.add(dinner);
		
		
	/*	
		System.out.println(dinner);
		System.out.println(lunch);
		System.out.println(snacks);
		System.out.println(tiffins);
		*/
		
		System.out.println(menu);
		//System.out.println(menu.get(0));
		
		//System.out.println(menu.get(0).get(0));
		
		
	}
	

}
