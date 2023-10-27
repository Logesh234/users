package Loops;
import java.util.Scanner;

public class NaturalEven {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int i=1;
		int count_even=0,count_odd=0;
		while(i<=number)
		{
			if(i%2==0)
			{
				count_even++;
				
			}
			else
			{
				count_odd++;
				
			}
			i++;
		}
		System.out.println("count of Even number: "+count_even);
		System.out.println("count of odd number: "+count_odd);
	}

}
