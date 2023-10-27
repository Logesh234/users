package Loops;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n =sc.nextInt();
		int s = 1;
		while(s<=n)
		{
			System.out.println(n);
			n++;
		}

	}

}
