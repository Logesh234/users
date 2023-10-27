package ForLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int i,r=0,a;
		for(;n!=0;)
		{
			a=n%10;
			System.out.println(a);

			n/=10;
			
			
			
		}
		

	}

}
