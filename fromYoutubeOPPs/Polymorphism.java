package fromYoutubeOPPs;
/*
   polymorphism =greek word for poly- "many", morph- "form"
                      The ability of an object to identify as more than one type
 */
  class fruits{
	public void eat() {
		
	}
}
class apple extends fruits{
	//overriden
public void eat() {
		System.out.println("you can eat apple");
	}
}
class mango extends fruits{
	//overriden
public void eat() {
	System.out.println("you can eat mango");
		
	}
}
class bananna extends fruits{
	//overriden
public void eat() {
	System.out.println("you can eat bananna");	
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		apple a1 =new apple();
		fruits m1 = new mango();
		bananna b1 =new bananna();
		
	fruits[] healthy = {a1,m1,b1};
		
	/*	a1.eat();
		m1.eat();
		b1.eat(); */
	for(fruits x: healthy ) {
		x.eat();
	}
		
		
	}

}
