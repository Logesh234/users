package Decoratordesignpattern;

public class NonVegFood extends FoodDecorator
{

	public NonVegFood(Food newFood) {
		super(newFood);
		//TODO Auto-generated constructor stub
	}
	public String prepareFood()
	{
		return super.prepareFood() +" With Roasted Chiken and Chiken Curry  "; 
		
	}
	
	
	public double foodPrice()
	{
		return super.foodPrice()+150.0;
		
	}
}
