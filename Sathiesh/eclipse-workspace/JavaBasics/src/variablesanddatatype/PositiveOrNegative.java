package variablesanddatatype;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter a number: ");
		double num = Scanner.nextDouble();
		if(num > 0)
		{
			System.out.println("The number is positive");
		}
		else if (num < 0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}

	}
	

}
