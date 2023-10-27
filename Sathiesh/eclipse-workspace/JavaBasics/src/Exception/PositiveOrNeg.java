package Exception;

import java.util.Scanner;

public class PositiveOrNeg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("positive");
		}
		else
		{
			try
			{
			throw new Exception("negative number");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}


