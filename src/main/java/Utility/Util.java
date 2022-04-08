package Utility;

import java.util.Scanner;
import java.util.Stack;
import java.lang.String;

public class Util {
public static Scanner sc = new Scanner(System.in);

public static int getPositiveInt()
{
	String str;
    int time=0;
	boolean valid = false;
	while (!valid) 
	{
	    try 
	    {
	    	System.out.println("Please Enter");
	       	str = Util.sc.next();  
	        time = Integer.parseInt(str);
	        if (time > 0) 
	        valid = true;
	    }
	    catch (NumberFormatException e) 
	    {
	    	System.out.println("Error, not a number. Please TRY AGAIN" + e);
	    }
	}
	return time;
}

public static int power(int a , int b ) {
	int X=(int) Math.pow(a,b);
	return X;
	}
	
public static double Fahrenheit(int celcius  ) {	
		double Temparature =( celcius * 18) + 32;
		return Temparature;
		}
	
public static double milesperhour(int KmPerHr  ) {
		  double MilesPerHour =( KmPerHr / 1.609344) ;
		return MilesPerHour;
		}
	

	public static double random() {
		 double random = Math.random();
			return random;
	}

public static String  CheckLeapYear(int year) {
	String Isleapyear = "";
	if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
		Isleapyear = year + " year is a leap year";
	}
     else {
          Isleapyear = year + " year is not a leap year";
  }
	
	return Isleapyear;
}

public static String  Checkalphabet(char ch) {
	String Isalphabet="";
	 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
		 Isalphabet = ch + " is vowel";
	 }
     else {
    	 Isalphabet = ch + " is consonant";

	}
	return Isalphabet;
}

public static String  Checkevenodd(int Number) {
	String Checkevenodd="";
	 if(Number % 2 ==0) {
		 Checkevenodd= Number+ " Number is even  ";
	    }
	    else {
	    	Checkevenodd=  Number+ " Number is odd  ";
	    }
	return Checkevenodd;
}

public static int  Quotient(int dividend,int divisor) {
	 int quotient = dividend / divisor;
	return quotient;
}

public static int  Remainder(int dividend,int divisor) {	
	    int remainder = dividend % divisor;
	return remainder;
}
}
