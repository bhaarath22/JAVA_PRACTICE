package practiceScratch;
import java.util.Random;
public class importRandom {
	public static void main(String args[]) {
		Random r=new Random();
		int i;
		float v;
		for(i=0;i<=5;i++) {
			v =r.nextFloat();
			System.out.println(v);
		}
	}

}
