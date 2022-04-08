package com.bridgelab.Assignment5;

import java.util.Scanner;
/**
 * @author atik
 * Sum of three integer adds to zero
 */
public class SumOfThree {
	public static void main(String[] args) {
		System.out.println("Enter five elements of array: "); 
        int [] arr = new int [5];
	Scanner sc = new Scanner(System.in);
	// Reading elements of array from user
	for(int i=0;i<5;i++) {  
		arr [i] = sc.nextInt();
	}
		int length = arr.length;
		int tripletsCount = 0;
		// Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				for (int k = j + 1; k < length; k++) { 	
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " "	+ arr[k]);
						tripletsCount++;
					}
				}
			}
		}
		System.out.println("The total number of triplets that add to 0 are: " + tripletsCount);
	}
}
