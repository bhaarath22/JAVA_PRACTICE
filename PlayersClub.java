package tHaleyadhu;
class PlayerRating{
	int PlayerPosition;
	String PlayerName;
	float CriticOneRating;
	float CriticTwoRating;
	float CriticThreeRating;
	float averageCriticRating;
public	char category;
	public PlayerRating(){
		
	}
public PlayerRating(int playerposition,String playername){
		PlayerPosition=playerposition;
		PlayerName=playername;
	}
public void calculateAverageCriticRaating(float CriticOneRating ,float CriticTwoRating) {
	this.CriticOneRating=CriticOneRating;
	this.CriticTwoRating=CriticTwoRating;
	float sum= CriticOneRating+CriticTwoRating;
	averageCriticRating=sum/2;
	
}
public void calculateAverageCriticRaating(float CriticOneRating ,float CriticTwoRating,float CriticThreeRating) {
	this.CriticOneRating=CriticOneRating;
	this.CriticTwoRating=CriticTwoRating;
	this.CriticThreeRating=CriticThreeRating;
	float sum= CriticOneRating+CriticTwoRating+CriticThreeRating;
	averageCriticRating=sum/3;
	
}
public void Calculatecategory(char category) {
	this.category=category;
	if(averageCriticRating>8)
		category='A';
	else if((averageCriticRating>=5)&&(averageCriticRating<=8))
     category='B';
	else if((averageCriticRating>=0)&&(averageCriticRating<5))
	     
	category='C';
	else
		category= '!';
	
}
public void Display() {
	System.out.println("player name is"+PlayerName);
	System.out.println("player position is"+PlayerPosition);
	System.out.println("CriticOneRating is"+CriticOneRating);
	System.out.println("CriticTwoRating is"+CriticTwoRating);
	System.out.println("CriticThreeRating is"+CriticThreeRating);
	System.out.println("AvergeCriticRating is"+averageCriticRating);
	System.out.println("player category is:" +category);
}
	
}



public class PlayersClub {
	public static void main(String[] args ) {
		PlayerRating p1= new PlayerRating(1,"vinod");
		p1.calculateAverageCriticRaating(1, 1, 1);
		p1.Display();
		
	}

}
