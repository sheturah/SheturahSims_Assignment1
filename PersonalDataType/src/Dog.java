
public class Dog {
	
	public static int weight;
	public static String name;
	public static String hairColor;
	
	Dog()
	{
		
	}
	
	public Dog(int weight, String name, String hairColor)
	{
		this.weight = weight;
		this.name = name;
		this.hairColor = hairColor;
	}
	
	public static String getHairColor() {
		return hairColor;
	}

	public static void setHairColor(String hairColor) {
		Dog.hairColor = hairColor;
	}

	public static void setWeight(int weight) {
		Dog.weight = weight;
	}

	public static void setName(String name) {
		Dog.name = name;
	}

	public int getWeight()
	{
		return weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String geHairColor()
	{
		return hairColor;
	}

	
	public static void bark()
	{
		System.out.println("Woof!");
	}
	
	public void rename(String name)
	{
		Dog.name = name;
	}
	
	public void eat()
	{
		System.out.println("You succesfully fed the dog! ");
	}

}
