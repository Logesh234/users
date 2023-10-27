package Exception;


	import java.util.Scanner;

	public class Demo {

		public static void main(String[] args) 
		{
			try
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the input");
			int n=sc.nextInt();
			System.out.println(n);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}
