package practiceScratch;

	class Student2{
		int id;
		String name;
		
	void insertRecord(int id,String name) {
	this.id =id;
	this.name=name;
		
	}
	void displayInformation() {
		System.out.println(id+"  "+name);
	}
	
	}
		//Creating another class TestStudent1 which contains the main method
		class Student22{
		//	int id;
		//	String name;
		public static void main(String args[]){
		//Student22 s1 =new Student22();
			Student2 s1=new Student2();
		//	also create multiple oblects to store info through refference
			Student2 s2 =new Student2();
			Student2 s3 =new Student2();
			Student2 s4 =new Student2();
			
			//initialization through method
			 s1.insertRecord(22, "bharath");
			 s2.insertRecord(22,"bharath");
			 s3.insertRecord(22,"bharath");
			 s4.insertRecord(22,"bharath");
			 
			 s1.displayInformation();
			 s2.displayInformation();
			 s3.displayInformation();
			 s4.displayInformation();
			
/*			// initialization through refference
			s1.id =22;
			s1.name="bharath";
			
			s2.id =22;
			s2.name="bharath";
			s3.id =22;
			s3.name="bharath";
			s4.id =22;
			s4.name="bharath";
			
			
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s4.id);
		System.out.println(s4.name);
		*/
		
		} 
		

}
