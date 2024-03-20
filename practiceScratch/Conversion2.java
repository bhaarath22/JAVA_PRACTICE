package practiceScratch;

class Narowing{
	double a=23.04;
	long b=(long)a;//explicitly type casting
	int c=(int)b;
}
class widening{
	int d= 320;
	long e=d;
	float f=e;
	
}
public class Conversion2 {
	public static void main(String[] args) {
		
		Narowing n1=new Narowing();
		System.out.println("double:"+n1.a);
		System.out.println("long:"+n1.b);
		System.out.println("int:"+n1.c);
		
		widening w1=new widening();
		System.out.println("int:"+w1.d);
		System.out.println("long:"+w1.e);
		System.out.println("float:"+w1.f);
	}

}

