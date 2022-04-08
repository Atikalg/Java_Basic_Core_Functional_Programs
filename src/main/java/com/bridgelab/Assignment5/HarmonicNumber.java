package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;

/**
 * @author atik
 * Printing Harmonic Number
 */
public class HarmonicNumber {
	public static void main(String[] args) {
		double n,i;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		n = sc.nextDouble();
		System.out.print("Harmonic number is:");
		for( i=1; i<=n; i++)
		{
			System.out.print("1/" + i + " +");
			sum = sum + (1/i);
		}
		System.out.println("");
		System.out.println("Harmonic value = "+sum);
	}
}
