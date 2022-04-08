package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Swapping two numbers
 */
public class SwapNumber {
	public static void main(String[] args) {
		   int first, second, temp; 
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of first and second number :");  
	       first = sc.nextInt();  
	       second = sc.nextInt();  
	       System.out.println("Before swapping numbers: " + first + "  " + second);  
	       //swapping  
	       temp = first;  
	       first = second;  
	       second = temp;  
	       System.out.println("After swapping: " + first + "   " + second);  
	       System.out.println( );  
	    }    
		
}
