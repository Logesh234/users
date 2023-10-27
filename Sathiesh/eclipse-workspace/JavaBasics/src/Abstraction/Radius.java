package Abstraction;

public  class Radius extends Shape1
{

	@Override
	void area() {
		double width = 5, height = 3;
	      double r = ((width * width) / (8 * height) + height / 2);
	      System.out.println( "Radius of the circle: "+r);
		
	}

	@Override
	void perimeter() {
		double width = 5, height = 3;
	      double r = 2*(height*width);
	      System.out.println( "Radius of the circle: "+r);
		
	}
	

}
