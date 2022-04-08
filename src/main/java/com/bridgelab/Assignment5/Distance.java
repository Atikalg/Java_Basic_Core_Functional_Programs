package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * calculating Euclidean distance
 */ 
public class Distance {
	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		System.out.print("Enter any two Numbers  to calculate distance: ");
		int X =	Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[0]);
		//calculating distance 
		int DistanceOfX=Util.power(X, 2);
		int DistanceOfY=Util.power(Y, 2);
		int Total =DistanceOfX + DistanceOfY;
		System.out.print("Total distance is: "  + Total);
		}
}
