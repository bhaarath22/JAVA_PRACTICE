package OOP;

public class CAr2003 {
	String brand ="TATA";
	String model ="nexon Ev";
	int number =1234;
	double price =4000000.555;
	String color ="green";
	
	public String toString() {
		String mystring = brand +"\n" +model+"\n"+number+"\n"+price+"\n"+color;
		return mystring   ;
		
		//or write like this
	//return brand +"\n" +model+"\n"+number+"\n"+price+"\n"+color;
	}
	


public static void main(String[] args) {
	
	CAr2003 car =new CAr2003();
	System.out.println(car.toString());
	
	
	
	
	
}	
}