
public class Circle {

	private double radius;
	
	Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
				
	}
	
	public double Circumference()
	{
		double circum = 2*(Math.PI)*radius;
		
		return circum;
	}
	
	public double Area()
	{
		double area = Math.PI*(Math.pow(radius, 2));
		return area;
	}
}
