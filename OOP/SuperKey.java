package OOP;
// works same as this key word
/*class Person{
	String name;
	int age;
	String color;
	
	Person(String name,int age,String color){
		this.name=name;
		this.age=age;
		this.color=color;
		
	} //  in place of to string we can use a method like void display()
	public String tostring() {
		return this.name+ " \n" +this.age+" \n" +this.color+"\n ";
	}
}
 class Hero extends Person{
	     String super_power;
	     Hero(String name,int age,String color,String super_power){
		 super(name,age,color);
		 this.super_power=super_power;
	 }
	 public String tostring() {
			return super.tostring()+this.super_power;
		}
 }




public class SuperKey {
	public static void main(String[] args ) {
		
		
	Hero hero1 = new Hero("Batman(BRUCE WAYNE)",23,"black" ," I AM RICH");
	
	//	System.out.println(" whatis ur name :"+hero1.name);
	//	System.out.println(" ur age"+hero1.age);
	//	System.out.println( " ur are "+hero1.color+" by the way");
	//	System.out.println( "hey Batman what are your super powers:"+hero1.super_power);
		
		
		Hero hero2 = new Hero("hanuman",10000, "orange","everyting");
		System.out.println(hero2.tostring());
		
	}

}
*/

/*

//  TO REFER immediate parent class instances 

class anImal{
	String color= "white";
	
}

class DoG extends anImal{
	String color ="brown";
	
	void printcolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKey{
	public static void main(String args[]) {
		
		DoG d1 =new DoG();
		
		d1.printcolor();
		
	}
}

*/

/*
// supre key word method invoke

class animal2{
	void eat() {
		System.out.println("eating");
		
	}
}
class dog2 extends animal2{
	
	void bark() {
		System.out.println("dog is barking");
	}
	
	void work() {
		 
		super.eat();
		bark();
	}
	
}

public class SuperKey{
	public static void main (String args[]) {
		dog2 d1 =new dog2();
		
		//d1.eat();
		//d1.bark();
		d1.work();	
		
	}
}

*/















