package Operators;

import java.util.Scanner;

public class BloodDonor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a>18 && a<=55 && b>=45)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}

	}

}
