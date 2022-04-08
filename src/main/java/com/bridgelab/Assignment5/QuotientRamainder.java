package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Display quotient and remainder of given number
 */
public class QuotientRamainder {
	public static void main(String[] args) {
		System.out.println("Enter dividend number: ");
        Scanner sc =new Scanner(System.in);
       int dividend=  sc.nextInt();
       System.out.println("Enter divisior number: ");
       Scanner scanner =new Scanner(System.in);
       	int divisor= scanner.nextInt();	 
      //Using function from utility package
	    int quotient =Util.Quotient(dividend, divisor);
	    int remainder =Util.Remainder(dividend, divisor);
	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}
}
