package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * calculating root of equation a*x*x+b*x+c
 */ 
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any Three Numbers : ");
		int A=	sc.nextInt();
		int B= sc.nextInt();
		int C= sc.nextInt();
		int SquareofB=Util.power(B, 2);
		
		// calculation of b*b-4*a*c
		double delta= (double) SquareofB -4 * A * C ;
		System.out.println("delta is  : " +delta);
		
		//calculation of roots positive and negative
		double Root1=(double) (-B + Util.power((int)delta, 2) ) / (2 * A);
		double Root2=(double) (-B - Util.power((int)delta, 2) ) / (2 * A);
		
		//Printing roots of equation
		System.out.println("Root one is :" +Root1);
		System.out.println("Root Two is :" +Root2);
	}

}
