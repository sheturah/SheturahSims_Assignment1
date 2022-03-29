import java.text.DecimalFormat;
import java.util.*;

public class Shapes {

	public static void main(String[] args) {
		
	
		CirCircum();
		RectPeri();
		TriangleSide();
		TriSide();
		
	}
	
	public static void CirCircum()
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		for (int i = 1; i<=10; i++)
		{
			Circle c1 = new Circle(i);
			
			System.out.println("Area of a circle with radius " + i + " is " + 
			df.format(c1.Area()) + " circumference is " + df.format(c1.Circumference()));
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void RectPeri()
	{
		
		for(int i = 1; i<=3; i++)
		{
			for(int j = 1; j<=3; j++)
			{
				Rectangle r1 = new Rectangle(i, j);
				
				System.out.println("Area of a rectangle " + i + " by " + j +  
						" is " + r1.area() + ". It's perimeter is " + r1.perimeter());
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void TriangleSide()
	{
		Triangle t1 = new Triangle(18, 30, 24);
		
		System.out.println("Area of a triangle 18x30x24 is " + t1.Area() + " it's perimeter is " + t1.perimeter() + " and it's height "
				+ "is " + t1.height());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
	public static void TriSide()
	{
		Triangle t2 = new Triangle(3,4,5);
		System.out.println("Area of a triangle 3x4x5 is " + t2.Area() + " it's perimeter is " + t2.perimeter() + " and it's height "
				+ "is " + t2.height());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
