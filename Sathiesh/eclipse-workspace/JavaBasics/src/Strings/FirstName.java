package Strings;
import java.util.Scanner;
public class FirstName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine(); 
		String [] strings = name.split(","); 
		String firstName = strings[0]; 
		String lastName = strings[1]; 
		System.out.println(firstName + " " + lastName); 
    } 
}

