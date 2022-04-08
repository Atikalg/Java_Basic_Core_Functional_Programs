package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Printing prime factors of given number
 */
public class PrimeFactors {
	public static void main(String[] args) {
		 System.out.println("Prime factors program");
		 System.out.println("Enter number: ");
	        Scanner sc = new Scanner(System.in);
	       int num = sc.nextInt();
	        if (num > 0) {
	        System.out.println("Prime factors of : " + num + " are :");
	            for (int i = 2; i <= num; i++) {
	                while (num % i == 0)
	                {
	                    System.out.println(i);
	                    num = num / i;
	                }
	            }
	        }
	        else {
	            System.out.println("Input is invalid ");

	        }
	}
}
