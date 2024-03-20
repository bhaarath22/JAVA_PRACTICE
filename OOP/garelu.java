package OOP;

   public class garelu {
String name;
String groats;
int quantity;


garelu(String name,String groats,int quantity){
	this.name=name;
	this.groats=groats;
	this.quantity=quantity;
	
}//here overloaded constructors .constructor with same name but differrent parameters arguments.
garelu(String name,int quantity){
	this.name=name;
	
	this.quantity=quantity;
	
}


// }
 
//public class Garelu{
	public static void main(String[] args[]) {
		garelu garelu1 = new garelu("menappu garelu","menappu",1);
		
		System.out.println("here is the ingrediantes of the garelu");
		System.out.println(garelu1.groats);
		
		garelu garelu2 = new garelu("pasarapappu",1);
		System.out.println(garelu2);
	}
	
   }

