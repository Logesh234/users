package Loops;

import java.util.Scanner;

public class Divisibleby {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		if(n>7 && n<100)
		{
			if(n%4==5 && n%4==6)
			{
				System.out.println(n);
			}
		}
		System.out.println(n);

	}

}
