package variablesanddatatype;

import java.util.Scanner;

public class FiveDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a int:");
		int n=sc.nextInt();
		if(n>10000 && n<=99999)
		{
			System.out.println("five digit:"+n);
		}
		else
		{
			System.out.println("Not a Five Digit");
		}

	}

}
