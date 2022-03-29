import java.util.Arrays;

public class Triangle {

		private double side1, side2, side3;
		
		public Triangle()
		{
			this.side1 = 3;
			this.side2 = 4;
			this.side3 = 5;
			
		}

		public Triangle(double side1, double side2, double side3) {
			super();
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
		public double perimeter()
		{
			double perimeter = side1+side2+side3;
			return perimeter;
		}
		
		public double Area()
		{
			double p=(side1+side2+side3)/2;
			double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
			return area;
		}
		
		public double height()
		{
			double min;
	     	double height;
	     	
	     	double[] array = {side1, side2, side3};
			
			Arrays.sort(array);
			
			min = array[0];
	     	height = (Area()*2)/min;
	     	
	     	return height; 
		}
		
		@Override
		public String toString()
		{
			return "Triangle has sides " + side1 + ", " + side2 + ", "+ side3 + ". It has an area of " + Area() + " and perimeter of " + perimeter();
		}

	

}
