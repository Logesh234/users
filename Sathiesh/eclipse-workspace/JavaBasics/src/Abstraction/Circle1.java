package Abstraction;

	public abstract class Circle1 extends Shape
	{
	private int radius;
	public Circle1()
	{
		
	}
	public Circle1(int radius) {
		super();
		this.radius = radius;
	}
		
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

		

		@Override
		public double area() {
			// TODO Auto-generated method stub
			return Math.PI*radius*radius;
		}

		@Override
		public double perimeter() {
			// TODO Auto-generated method stub
			return 2*Math.PI*radius;
		}
		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
		}


	}
