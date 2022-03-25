import java.lang.reflect.Array;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number;
		boolean isFound;
		int[] userSet = new int[10];

		userSet = FillArray();
		System.out.println("What is the target number? ");
		number = scan.nextInt();

		isFound = Binary(number, userSet);
		
		System.out.println(isFound);
		
	

	}

	//Binary search from scratch
	public static boolean Binary(int targets, int[] numbers) {
		boolean isFound = false;

		int target = targets;
		int high = numbers.length- 1;
		int low = 0;
		int mid = 0;

		
		while (high >= low) {
			mid = (high + low) / 2;

			if (numbers[mid] == target) {
				isFound = true;
				break;
			} else if (numbers[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

			
		}

		return isFound;
	}

	//User fills the array 
	public static int[] FillArray() {
		
		Scanner scan = new Scanner(System.in);
		int numbers[] = new int[10];
		int temp;

		System.out.println("Please enter 10 numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Interger " + (i + 1) + ": ");
			temp = scan.nextInt();
			numbers[i] = temp;
		}
		
		for(int i : numbers)
		{
			System.out.print(i + ", ");
		}

		return numbers;
	}

}
