package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Printing power of two and checking result is leap year or not
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		int result = 0;
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter between 1 to 32 numbers : ");
		double uservalue = Integer.parseInt(args[0]);
		for(int i=1; i<=uservalue; i++) {
		if(uservalue<32)
         {
			 result= (int) Util.power(2, i); //using function of math power from utility package
             System.out.println(2 + " " +" to power of " +i+ "=" + result);
         }
	}
		 if (((result % 4 == 0) && (result % 100!= 0)) || (result % 400 == 0)) {
	         System.out.println( +result + " year is a leap year");
		 }
	         
	      else {
	         System.out.println( + result + " year is not a leap year");
	      }
	}
}
