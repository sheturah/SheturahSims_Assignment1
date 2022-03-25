import java.util.Scanner;

public class BinaryBubbles {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int target;
		int[] array = new int[11];
		
		array = BubbleSort();
		
		System.out.println("\nWhat is the target number? ");
		target = scan.nextInt();
		
		Binary(target, array);
		
		
	}
	
	public static int[] BubbleSort()
	{
		
		int[] array = FillArray();
		
		int temp1,temp2;	
		
		for(int i = 1; i < array.length-1; i++)
		{
			for(int j = 0; j < array.length-1; j++)
			{
				if(array[j] > array[j+1])
				{
					temp1 = array[j];
					temp2 = array[j+1];
					
					array[j+1] = temp1;
					array[j] = temp2;
				}
				
			}
		}
		
		for (int i : array)
		{
			System.out.print(i + ", ");
		}
		
		
		return array;
	}
	
	public static int[] FillArray() {
		
		Scanner scan = new Scanner(System.in);
		int numbers[] = new int[11];
		int temp;

		System.out.println("Please enter 10 numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Interger " + (i + 1) + ": ");
			temp = scan.nextInt();
			numbers[i] = temp;
		}
		
		
	

		return numbers;
	}
	
	public static void Binary(int targets, int[] numbers) {
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

		if(isFound)
		{
			System.out.println("The target is in the set.");
		}
		else
		{
			System.out.println("The target is not in the set.");
		}
	}
}
