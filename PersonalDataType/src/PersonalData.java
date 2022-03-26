import java.util.*;

public class PersonalData {

	public static void main(String[] args) {

		String first, last, major, onProbation;
		double gpa;
		int age;

		Scanner scan = new Scanner(System.in);

		System.out.println("First: ");
		first = scan.nextLine();

		System.out.println("Last: ");
		last = scan.nextLine();

		System.out.println("Major: ");
		major = scan.nextLine();

		System.out.println("GPA: ");
		gpa = scan.nextDouble();

		System.out.println("Age: ");
		age = scan.nextInt();

		System.out.println();

		Student myStudent = new Student(first, last, gpa, major, age);

		System.out.println(myStudent.toString());

		haveDog();
		

	}

	public static void haveDog() {
		
		Scanner scan = new Scanner(System.in);
		String dog;
		System.out.println("Do you have a dog ");
		dog = scan.nextLine();
		
		System.out.println(dog);
		dog = dog.toLowerCase();
		if(dog.equals("y"))
		{
			
			createDog();
		}
		
	}
	
	public static void createDog()
	{
		Scanner scan = new Scanner(System.in);
		
		Dog d1 = new Dog();
		
	}

}
