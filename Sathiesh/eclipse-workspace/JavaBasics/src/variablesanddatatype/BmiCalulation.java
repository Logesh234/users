package variablesanddatatype;
import java.util.Scanner;
public class BmiCalulation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter weight : ");
		double weight = input.nextDouble();
		System.out.println("please enter height: ");
		double height = input.nextDouble();
		double BMI = weight /(height*height);
		System.out.println("BMI of the user is:"+BMI);
		
	}

}
