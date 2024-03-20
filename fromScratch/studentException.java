package fromScratch;

class student2323 {
	


	int RollNo;
	String name;
public	int age;
	String course;
	 public student2323(int rollno,String Name,int Age,String Course) throws Exception {
		 RollNo=rollno;
		 name=Name;
		 age=Age;
		 course=Course;
		 if(age<15||age>21) {
			 throw new Exception("age not with in range");
		 }
		 
		 
	 } 
	 public String toString() {
		 return name+"\n"+RollNo+"\n"+course+"\n"+age;
	 }
}
public class studentException{
	 public static void main(String[]args) {
		 try {	 
	 student2323 s1=new student2323(4,"vamshi",14,"robotics&ai");
	 System.out.println(s1);

			 
		 }
	 catch(Exception s){
		 System.out.println("AgeNotWithinRangeException”.");
		 
	 }
	 
	 
}}