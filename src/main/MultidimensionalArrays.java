package main;

public class MultidimensionalArrays {
	
	public static void main(String[] args) {
		
		int multiArray[][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(multiArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
