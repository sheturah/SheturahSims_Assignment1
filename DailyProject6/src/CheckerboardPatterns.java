import java.util.Scanner;

public class CheckerboardPatterns {
//Project focuses on nested loops and 2D Arrays
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int width, height;

		System.out.println("Enter the checkerboard's width: ");
		width = scan.nextInt();

		System.out.println("Enter the checkerboard's height: ");
		height = scan.nextInt();

		PrintColors();
		PrintChecker(height, width);
		PrintStars(height);
		PrintTimes(width, height);

	}

	// using a 2D array
	public static void PrintColors() {
		
		String[][] fancyColors = { { "Red", "Blue", "Green" }, { "Cyan", "Magenta", "Turqiouse" } };

		System.out.println("[Color Generator]");
		
//for the row (there are two rows of colors)
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(fancyColors[i][j] +  ", ");
				
				if((j+1) % 3 == 0)
				{
					System.out.println();
				}
			}

		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");

	}

	// this method prints checker board
	public static void PrintChecker(int row, int column) {

		System.out.println("[CheckerBoard Generator]");
		char black = '■';
		char white = '□';

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if ((i + j) % 2 == 0) {
					System.out.print(black);
				} else {
					System.out.print(white);
				}

			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
	}

	public static void PrintStars(int row) {

		String symbol = " * ";
		
		System.out.println("[Star Generator]");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {

				System.out.print(symbol);
			}
			System.out.println();
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~");

	}

	public static void PrintTimes(int starter, int rows)
	{
		int answer;
	
		System.out.println("[Times Table Generator]");
		for(int i = 1; i <= rows ; i++)
		{
			answer = starter*i;
			System.out.println(starter + " * " + i + " = " + answer);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
	}

}
