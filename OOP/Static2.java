package OOP;

class Friend{

static int nooffriends;
	String name;
	Friend(String name){
		nooffriends++;
	}
	
	static void display() {
		System.out.println(" you have : "+nooffriends+" friends");
	}
}

public class Static2 {
	public static void main(String[ ] args) {
	Friend friend1 =new Friend("sathvik");
	Friend friend2 =new Friend("teja");
	Friend friend3 =new Friend("rahul");
	
  //  System.out.println(Friend.nooffriends);
    Friend.display();
    
    
}
}