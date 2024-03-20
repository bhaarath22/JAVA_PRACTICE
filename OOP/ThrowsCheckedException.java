package OOP;
import java.io.IOException;
//propagation
public class ThrowsCheckedException {

	void m()throws IOException{
		throw new IOException("error");
	}
	void n()throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}
		catch (IOException e) {
			System.out.println(e);
		}}
	public static void main(String[] args) {
		ThrowsCheckedException c1=new ThrowsCheckedException();
		c1.p();
	}
}
