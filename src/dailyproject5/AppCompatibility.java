package dailyproject5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppCompatibility {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String device;
		
		
		System.out.println("[App Checklist]");
		System.out.println("What mobile device do you have? ");
		device = scan.nextLine();
		
		device = device.toLowerCase();
		
		if (device.equals("android"))
		{
			Android();
		}
		else if(device.equals("apple"))
		{
			Apple();
		}
		else
		{
			System.out.println("I'm sorry.");
		}
		
	}
	
	//if the user inputs that they use an apple phone
	public static void Apple()
	{
		Scanner scan = new Scanner(System.in);
		int version = 0;
		boolean error;
		char nfc = 0;
		
		//do loop that checks what version of iphone the user has
		do {
			
			error = false;
			
			try {
				
		System.out.println("What version do you have? ");
		version = scan.nextInt();
		
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter just the number!");
				error = true;
				scan.nextLine();
				
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid version");
				error = true;
				scan.nextLine();
			}
			
		}while(error);
		
	//if the user has a iphone 6 or higher and whether it supports nfc
		if(version > 5)
		{
			do {
				
			
			error = false;
			
			try {
			System.out.println("Does your device support NFC? ");
			nfc = scan.next().charAt(0);
			
			nfc = Character.toUpperCase(nfc);
			
			}
			catch(Exception e)
			{
				System.out.println("Please enter (Y/N)!");
			}
			
     //based on the user input it determines whether it is compatible
			if(nfc == 'Y')
			{	
			System.out.println("Congradulations, you can run the app!");					
			}
			else if (nfc == 'N')
			{
				System.out.println("I'm sorry, our app does not support your device.");
			}
			else
			{
				error = true;
				System.out.println("Please enter Yes or No");
			}
			 
			}while(error);
			
			
		}else
		{
			System.out.println("I'm sorry, our app does not support your device.");
		}
	}
	
	public static void Android()
	{
		Scanner scan = new Scanner(System.in);
		float version = 0;
		boolean error;
		char bluetooth = 0;
		
		//do loop that ask what version of android is being used and whether it is compatible
		do {
			
			error = false;
			
			try {
				
		System.out.println("What version do you have? ");
		version = scan.nextFloat();
		
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter a number!");
				error = true;
				scan.nextLine();
				
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid version");
				error = true;
				scan.nextLine();
			}
			
		}while(error);
		
		
		// checks if device has blue tooth connections
		do {
				
			
			error = false;
			
			try {
			System.out.println("Does your device support bluetooth devices? ");
			bluetooth = scan.next().charAt(0);
			
			bluetooth = Character.toUpperCase(bluetooth);
			
			}
			catch(Exception e)
			{
				System.out.println("Please enter (Y/N)!");
				error = true;
			}
			
		}while(error);
		
		if (version > 10 || bluetooth == 'Y' )
		{
			System.out.println("Congradulations, you can run the app!");
		}
		else
		{
			System.out.println("I'm sorry, our app does not support your device.");
		}
		
				
	}
	

}
