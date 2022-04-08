package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Checking whether alphabet vowel or consonant
 */
public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next( ).charAt(0);
		//using check alphabet function from utility package
		String CheckAlphabet = Util.Checkalphabet(ch);
		System.out.println(CheckAlphabet);
	}
}
