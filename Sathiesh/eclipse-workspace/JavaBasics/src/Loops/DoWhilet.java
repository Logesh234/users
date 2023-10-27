package Loops;
import java.util.Scanner;
public class DoWhilet {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s;
			do
			{
			System.out.println("enter the number");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:System.out.println("large");
				break;
				case 2:System.out.println("medium");
				break;
				case 3:System.out.println("small");
				break;
			}
		
			System.out.println("do u want to continue");
			s=sc.next();
		}
			while(s.equals("Y"));
			
		
	}
	}
