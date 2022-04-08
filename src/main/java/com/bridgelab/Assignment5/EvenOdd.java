package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Checking whether number even or odd
 */
public class EvenOdd {
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		//using function of even odd from utility package
		String CheckEvenOdd = Util.Checkevenodd(Number);
		System.out.println(CheckEvenOdd);
    }
}
