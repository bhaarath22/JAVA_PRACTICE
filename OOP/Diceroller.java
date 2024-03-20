package OOP;
import java.util.Random;
public class Diceroller {
	Random	random;
	int number;
	
	Diceroller(){
		random = new Random();

	roll();
	
		
	}
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
		
	}

}
