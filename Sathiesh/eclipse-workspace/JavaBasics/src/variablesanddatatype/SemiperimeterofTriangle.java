package variablesanddatatype;

import java.util.Scanner;

public class SemiperimeterofTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter first side: ");
		double a = in.nextDouble();
		System.out.println("enter second side :");
		double b = in.nextDouble();
		System.out.println("enter third side :");
		double c = in.nextDouble();
		double perimeter = a+b+c;
		double s = perimeter/2;
		double area = Math.sqrt (a*(s-a)*(s-b)*(s-c));
		System.out.println("Perimeter ="+ perimeter);
		System.out.println("Area ="+ area);

	}

}
