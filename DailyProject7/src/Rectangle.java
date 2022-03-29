
public class Rectangle {

	private double height, width;

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public Rectangle() {
		
	}

	public double perimeter() {
		return (2 * height + 2 * width);
	}

	public double area() {
		
		return (height*width);

	}

}
