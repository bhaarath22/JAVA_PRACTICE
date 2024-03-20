package practiceScratch;

class add_num{
	public int add(int a,int b) {
		return a+b;
		
	}
}
public class add{
	public static void main(String args[]) {
		int a,b;
		a=3;
		b=6;
		add_num ob= new add_num();
		System.out.println("addition is:"+ob.add(a,b));
		
		
	}
}