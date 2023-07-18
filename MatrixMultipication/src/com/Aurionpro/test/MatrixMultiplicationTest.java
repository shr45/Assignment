package com.Aurionpro.test;

import java.util.Scanner;

import com.Aurionpro.model.MatrixMultiplication;

public class MatrixMultiplicationTest {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        MatrixMultiplication matrix=new MatrixMultiplication();

	        System.out.print("Enter the number of rows for matrix 1: ");
	        int rows1 = scanner.nextInt();
	        System.out.print("Enter the number of columns for matrix 1: ");
	        int cols1 = scanner.nextInt();

	        int[][] matrix1 = new int[rows1][cols1];
	        System.out.println("Enter the elements of matrix 1:");

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols1; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.print("Enter the number of rows for matrix 2: ");
	        int rows2 = scanner.nextInt();
	        System.out.print("Enter the number of columns for matrix 2: ");
	        int cols2 = scanner.nextInt();

	        int[][] matrix2 = new int[rows2][cols2];
	        System.out.println("Enter the elements of matrix 2:");

	        for (int i = 0; i < rows2; i++) {
	            for (int j = 0; j < cols2; j++) {
	            	
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }

	        scanner.close();

	        int[][] result = matrix.multiplyMatrices(matrix1, matrix2);

	        System.out.println("Matrix Product:");
	        for (int[] row : result) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    

	

	}

}
