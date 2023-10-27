package Operators;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int tot = (a+b);
		double per = ((double)tot/100)*100;
		if(a>=20 && b>=20)
		{
			if(per >= 45 && per >=44)
			{
				System.out.println("Result is: passed,Final Mark:"+tot);
			}
			else
			{
				System.out.println("Result is: failed,Final Mark:"+tot);
			}
		}
		else
		{
			System.out.println("Result is: passed,Final Mark:"+tot);
		}
		

	}

}