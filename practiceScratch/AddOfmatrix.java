package practiceScratch;

public class AddOfmatrix {
public static void main(String args[]) {
	//int myArray[][];//declaration
	//myArray=new int[2][3];//creation
	
	/*int myArray[][]= new int[2][3];//declaration &creation
	int myArray1[][]=new int[2][3];
	int array[][]= new int[2][3];*/
	
	int myArray[][]= {{1,2,3},{4,5,6}};
	int myArray1[][]= {{1,2,3},{4,5,6}};
	 int sum[][]= new int [2][3];
	 int i, j;
	 for(  i=0;i<myArray.length;i++) {
		 for(j=0;j<myArray[0].length;j++) {
			 sum[i][j]=myArray[i][j]+myArray1[i][j];
			 
		 }
	 }
	 System.out.println("the additon of two matrices is:");
	 for(  i=0;i<myArray.length;i++) {
		 for(j=0;j<myArray[0].length;j++) {
			 System.out.println(sum[i][j]);
			
		 }
	
System.out.println("");

}

}
}
