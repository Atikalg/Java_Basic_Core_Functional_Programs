package com.bridgelab.Assignment5;

import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * printing entered year is leap or not
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("please any four digit year : ");
		int year =scanner.nextInt();
		int length = String.valueOf(year).length();
		if (length == 4) {
	String leapYear = Util.CheckLeapYear(year);
	 System.out.println(leapYear);
		}
		else {
			System.out.println("enter four digit year");
		}
	}
}
