package dailyproject5;

import java.util.Scanner;

public class Scheduling {

	public static void main(String[] args) {
		
		int caseNumb;
		int time;
		 
		System.out.println("[Instructor Scheduler]");
		
		caseNumb = getDay();
		time = getTime();
		
		caseNumb = caseNumb + time;
		
		PrintSchedule(caseNumb);
		
	
	}
	
	//what day is the class
	public static int getDay()
	{
		Scanner scan = new Scanner(System.in);
		char day;
		boolean error = true;
		int dayCase = 0;
		
		do
		{
			
		System.out.println("What day of the week is it? (M/T/W/R/F)");
		day = scan.next().charAt(0); 
		day = Character.toUpperCase(day);

		
	if (day == 'M' || day == 'T'|| day == 'W' || day == 'R' || day == 'F')
		{
			
		error = false;
			
		}
		else
		{
			System.out.println("Please enter a day of the week that is valid. Using (M/T/W/R/F)");
			error = true;
		}
		
		
		}while(error);
		
		
		if (day == 'M')
		{
			dayCase = 1;
		}
		else if (day == 'T')
		{
			dayCase = 3;
		}
		else if (day == 'W')
		{
			dayCase = 5;
		}
		else if (day == 'R')
		{
			dayCase = 7;
		}
		else if (day == 'F')
		{
			dayCase = 9;
		}
		
		return dayCase;
	}
	
	
	//what time of day does is the class
	public static int getTime()
	{
		Scanner scan = new Scanner(System.in);
		char time;
		boolean error = true;
		int timeCase;
		
		do
		{
			
		System.out.println("What time of day? (am/pm)");
		time = scan.next().charAt(0); 
		time = Character.toUpperCase(time);
		
		
		if (time == 'A' || time == 'P')
			
		{
			error = false;
		}
		
		else
		{
			System.out.println("Please enter am or pm.");
			error = true;
		}
		
		}while(error);
		
		if (time == 'A')
		{
			timeCase = 0;
		}
		else
		{
			timeCase = 1;
		}
		
		return timeCase;
		
	}
	public static void PrintSchedule(int caseNumb)
	{
		switch(caseNumb)
		{
		
		case 1:
			System.out.println("On Monday Morning, you値l be teaching C++, section E04!");
			break;
		case 2:
			System.out.println("On Monday Afternoon, you値l be teaching Java, section J02!");
			break;
		case 3:
			System.out.println("On Tuesday Morning, you値l be holding Office hours!");
	     break;
		case 4:
			System.out.println("On Tuesday Afternoon, you値l be teaching C#, section W#1!");
			break;
		case 5:
			System.out.println("On Wednesday Morning, you値l be teaching C#, section #02!");
			break;
		case 6:
			System.out.println("On Wednesday Afternoon, you値l have some free time!");
			break;
		case 7:
			System.out.println("On Thursday Morning, you値l be holding Office hours!");
			break;
		case 8:
			System.out.println("On Thursday Afternoon, you値l be teaching C++, section WE3!");
			break;
		case 9:
			System.out.println("On Friday Morning, you値l be teaching Java, section WJ3!");
			break;
		case 10:
			System.out.println("On Friday Afternoon, you値l have some free time!");
		
		
		
		}
		
	}

}
