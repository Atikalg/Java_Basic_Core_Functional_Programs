package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Printing two dimensional array
 */ 
public class TwoDArray {
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter  no of rows you want: ");
		int row = sc.nextInt();
		System.out.print("Enter  no of column  you want: ");
		int column = sc.nextInt();  
		int [][] matrix = new int[row][column];
		for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++) {
		        System.out.println("Row ["+i+"]:  Column " +j+ " :");
		    matrix[i][j] = sc.nextInt(); 
		}
	}
		for(int i = 0; i<row; i++) {
		    for(int j = 0; j<column; j++) {
		        System.out.print(matrix[i][j]);
		    }
		    System.out.println();
		}		
	}
}
