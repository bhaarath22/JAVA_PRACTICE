package tHaleyadhu;

public class EnhancedForloop {
	int marks[]= new int[5];
	public void storemarks(int m,int p,int c,int java,int python) {
		marks[0]=m;
		marks[1]=p;
		marks[2]=c;
		marks[3]=java;
		marks[4]=python;
	}
	public void display() {
		System.out.println("the following are the marks \n");
		for(int i:marks) {
			System.out.println(i);
		
	}}
public static void main(String[] args) {
	EnhancedForloop s1= new EnhancedForloop();
	s1.storemarks(23, 230, 340, 40, 20);
	s1.display();
}
}
