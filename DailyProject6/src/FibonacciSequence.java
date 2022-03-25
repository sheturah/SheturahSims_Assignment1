import java.util.Scanner;

//building a basic algorithm
public class FibonacciSequence {

	public static void main(String[] args) {

		int length;
		
		System.out.println("[Fibonacci Sequence Generator]");
		length = PosNumb();
		PrintFibo(length);

	}

	public static int PosNumb() {
		Scanner scan = new Scanner(System.in);
		int numb = 0;
		boolean error;

		do {

			error = false;
			try {
				System.out.println("How long should the Fibonacci Sequece be? ");
				numb = scan.nextInt();

			} catch (Exception e) {
				System.out.println("Please enter a valid number. ");
				error = true;
				scan.nextLine();
			}
			if (numb < 1) {
				System.out.println("Sequences must be larger than 0!");
				error = true;
			}

		} while (error);

		return numb;

	}

	public static void PrintFibo(int length)
	{
		int[] fibo = new int[length];
		int tempOne = 0;
		int tempTwo = 0;
		int current = tempOne + tempTwo;
		
		for(int i = 0; i< length; i++)
					
		{
			
			if(i < 2)
			{
				fibo[i] = i;
			}else
			{
				tempOne = fibo[i-2];
				tempTwo = fibo[i-1];
			  current = tempOne + tempTwo;
				fibo[i] = current;
			}
			
			
		}
		
		System.out.println("Okay, here's your sequence!");
		
		for(int i:fibo)
		{
			System.out.print(i + ", ");
		}
	}

}
