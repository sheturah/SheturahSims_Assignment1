package dailyproject5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BucketListRewards {

	public static void main(String[] args) {
		
		System.out.println("[Scrappy's Bucket list Rewards!]");
		double percent = getPercent();
		int prizes = getPrizes(percent);
		
		
		if(prizes == 0)
		{
			System.out.println("Check out events at https://studentaffairs.georgia.edu/bucketlist/!");
		}
		else
		{	
			Earnings(prizes);	
		}
		
		if(prizes == 5)
		{
			Graduating();
		}
		
		
		
		
	}
	
	//this retrieves the percentage from the user
	 public static double getPercent()
	 {
		 Scanner scan = new Scanner(System.in);
			double eventsAttended = 0;
			boolean error;
			double percent;
			do {
				error = false; 
				
				try {
					
			System.out.println("How many events have you attended? ");
			eventsAttended = scan.nextDouble();
			
				}
				catch (InputMismatchException e)
				{
		
					System.out.println("The input was not a number, Please try again!");
					error  = true;
					scan.nextLine();
				}
				if (eventsAttended < 0 || eventsAttended > 63)
				{
					System.out.println("There were 63 total events. Please enter a number between 0 and 63!");
					error = true;
				}
				
			}while(error);
			
			percent = (eventsAttended/63)*100;
			int newPercent = (int)percent;
			 System.out.println("You've been to " + newPercent + "% of all the SBL events!");
			 
			 
			 return percent;
		 
	 }
	 
	 //this method prints out the earning of the user
	public static void Earnings(int prizes)
	{
		for(int i = 1; i <= prizes; i++)
		{
		switch(i) {
		case 1:
			System.out.println("You've earned a Drawstring Bag!");
			break;
		case 2:
			System.out.println("You've earned a Hat!");
			break;
		case 3:
			System.out.println("You've earned a T-Shirt!");
			break;
		case 4:
			System.out.println("You've earned a Glass Water Bottle!");
			break;
		case 5:
			System.out.println("You've earned a Hoodie!");
			break;
			
		}
		
		}
		
		
	}
	
	//This determines how many prizes the player receives
	public static int getPrizes(double percent)
	{
		int prizes = 0;
		//under 10 percent
		 if(percent < 10)
		 {
			 prizes = 0;
		 }
		 //under 25 percent
		 else if (percent < 25 && percent > 9.99)
		 {
			 prizes = 1;
		 }
		 //under 50 percent
		 else if (percent < 50 && percent > 24.99)
		 {
			 prizes = 2;
		 }
		 //under 75 percent
		 else if (percent < 75 && percent > 49.99)
		 {
			 prizes = 3;
		 }
		 //under 100 percent
		 else if (percent < 100 && percent >74.99)
		 {
			 prizes = 4;
		 }
		 else if (percent == 100)
		 {
			 prizes = 5;
		 }
		 
		
		 
		
		return prizes;
	}
	
	//this asks the user of they are graduating or not
	public static void Graduating()
	{
		Scanner scan = new Scanner(System.in);
		boolean error;
		char areGraduating = 'n';
		error = true;
		
		do {
			
			
		System.out.println("Are you graduating?");
		areGraduating = scan.next().charAt(0);
		
		areGraduating = Character.toUpperCase(areGraduating);
		
		error = false;
		
		if(areGraduating == 'Y' || areGraduating == 'N')
		{
	
		System.out.println("There's a special reward when you graduate!");
		
			
		}
		else
		{
			error = true;
			System.out.println("Please enter Yes or No");
		}
		 
		
		}while(error);
		
			
	
		
	}

}
