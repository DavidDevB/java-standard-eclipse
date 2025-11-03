package exercice6;

import java.util.Arrays;

public class Matrix {
	
	public static void main(String[] args) {
		
		int[][] firstMatrix = {{1, 2, 0}, {4, 3, -1}};
		int[][] secondMatrix = {{5, 2, 3}, {1, 3, 4}};
		
		// Create a array of array of int from the length of the first matrix.
		int[][] results = new int[firstMatrix.length][firstMatrix[0].length];
		
		System.out.println("Matrices:");
		System.out.println("Matrix1 " + Arrays.deepToString(firstMatrix));
		System.out.println("Matrix2 " + Arrays.deepToString(secondMatrix));
		System.out.println("Results:");
		System.out.println("Addition " + Arrays.deepToString(add(firstMatrix, secondMatrix, results)));
		System.out.println("Substraction " + Arrays.deepToString(sub(firstMatrix, secondMatrix, results)));
		System.out.println("Multiplication (Matrix1 * x)" + Arrays.deepToString(mul(firstMatrix, 5, results)));
	}
	
	public static int[][] add(int[][]mat1, int[][] mat2, int[][] res) {
		
		/**
		 * Algorithm iterating into the matrix and adding both together to get the result.
		 
		@mat1: first matrix
		@mat2: second matrix
		@res: empty array of array of int.  
		*/
		
		for (int i = 0; i < mat1[0].length; i++) {
			res[0][i] =  mat1[0][i] + mat2[0][i];
			res[1][i] =  mat1[1][i] + mat2[1][i];
		}
		return res;
	}

	
	public static int[][] sub(int[][]mat1, int[][] mat2, int[][] res) {
		
		/**
		 * Algorithm iterating into the matrix and substracting matrix 2 from matrix 1 to get the result.
		 
		@mat1: first matrix.
		@mat2: second matrix.
		@res: empty array of array of int.  
		*/
		
		for (int i = 0; i < mat1[0].length; i++) {
			res[0][i] =  mat1[0][i] - mat2[0][i];
			res[1][i] =  mat1[1][i] - mat2[1][i];
		}
		return res;
		
	}
	
	public static int[][] mul(int[][]mat1,int x, int[][] res) {
		
		/**
		 * Algorithm iterating into the matrix and multiply matrix 1 by "x" to get the result.
		 
		@mat1: first matrix.
		@x: an integer.
		@res: empty array of array of int.  
		*/
		
		for (int i = 0; i < mat1[0].length; i++) {
			res[0][i] =  mat1[0][i] * x;
			res[1][i] =  mat1[1][i] * x;
		}
		return res;
		
	}
	
}
