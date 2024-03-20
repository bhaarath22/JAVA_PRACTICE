package fromScratch;

public class matrixAdd {
	
	public static void main(String[] args) {
		int[][] matrix1= { {4,5,6},{1,2,23},{12,13,14}};
		int[][] matrix2= {{1,4,6},{2,5,7},{11,22,33}};
		int[][] result = new int[matrix1.length][matrix1[0].length];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0; j<matrix1[i].length;j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
				
				
			}
		}
	System.out.println("matrix sum :");
	for(int i=0;i<result.length;i++) {
		for(int j=0;j<result[i].length;j++) {
			System.out.println(result[i][j]+"");
		}
		System.out.println();
		
	}
	}

}
