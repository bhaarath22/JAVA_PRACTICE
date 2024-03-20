package fromYoutubeOPPs;
/*
 * // interface =
a template that can be applied to a class. similar to inheritance, but specifies what a class has/must do.
 classes can apply more than one interface, inheritance is limited to 1 super
 */
interface lion{
	 public void hunt() ;
		 
	 
}

interface cheetha{
	public void run();
}

class tigher implements lion{
public	void hunt() {
	System.out.println("* i am the hunter*");
	}
}

class deer implements cheetha{
	public void run() {
		System.out.println("i am the flash");
		
	}
}

class blackpanther implements lion,cheetha{

	@Override
	public void run() {
		System.out.println("i can move fast");
		
	}

	@Override
	public void hunt() {
		
		System.out.println(" i can catch you");
	}
	
}

public interface Interface1 {
public static void main(String[] args) {
	
/*	lion l1 =new tigher();
	l1.hunt();
	deer d1 =new deer();
	System.out.println();
	d1.run();*/
	
	blackpanther b1= new blackpanther();
	b1.hunt();
	b1.run();

}
}
