package com.bridgelab.Assignment5;
import java.util.Scanner;
import Utility.Util;
/**
 * @author atik
 * Checking weather temperature 
 */
public class WindChill {
	public static void main(String[] values) {
	//	Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Temparature  and speed : ");
		//int temperature = Integer.parseInt(args[0]);
		//int windSpeed = Integer.parseInt(args[1]);
		int temperature = Util.getPositiveInt();
		int windSpeed = Util.getPositiveInt();
		if (temperature > 50) {
			System.err.println("The value of temperature in Fahrenheit cannot be larger that 50");
			System.exit(0);
		}
		if (windSpeed > 120 || windSpeed < 3) {
			System.err.println("The value of Wind Speed in mph must be between 3 and 120");
			System.exit(0);
		}
		  //double t = Util.Fahrenheit( temperature );
		   Util.milesperhour(windSpeed);
		   
		   //calculating effective temperature (the wind chill)
		   double EffectiveTemperature =35.74 + (0.6215 * temperature) + (0.4275 * temperature -35.75) * Util.power(windSpeed, (int)0.16);
		   System.out.print("Effective Temperature is : " + EffectiveTemperature);
	}
}
