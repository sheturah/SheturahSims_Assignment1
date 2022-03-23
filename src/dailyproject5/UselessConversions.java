package dailyproject5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UselessConversions {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		final double candyBar = .00000848327;
		final double refrigerator = .00105745;
		long answer;
		double miles;
		
		miles = getMiles();
		
		System.out.println("You walked " + miles + " miles today #fitnessgoals");
		
		PrintFridge(miles, refrigerator);
		PrintCandy(miles, candyBar);
		
	}
	
	public static double getMiles()
	{
		Scanner scan = new Scanner(System.in);
		double miles = 0;
		boolean error;
		
		do {
			error = false;
		try {
			
			
		System.out.println("Enter a number of miles: ");
		miles = scan.nextDouble();
		
		
		}
		catch (InputMismatchException e)
		{
		
	
			System.out.println("The input was not a number, Please try again!");
			error  = true;
			scan.nextLine();
		}
		if(miles < 0)
		{
			System.out.println("The number you entered was negative!, Please try again! ");
			error = true;
			
		}
		
		
		}while(error);
		
		
		return miles;
		
		}
	
	
	public static void PrintFridge(double miles, double refridgerator)
	{
		double answer = (miles/refridgerator);
		System.out.println("\nUseless Conversion Bot: Wow, " + miles + " miles is "+ (long)answer + " refridgerators long!");
		
	}
	
	public static void PrintCandy(double miles, double candybar)
	{
		double answer = (miles/candybar);
		System.out.println("\nUseless Conversion Bot: Wow, " + miles + " miles is "+ (long)answer + " candy bars long!");
		System.out.println("\nUseless Conversion Bot: That's a lot.");
	}

}
