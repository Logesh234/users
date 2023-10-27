package Array;
import java.util.Scanner;
public class ForEach {
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int size=sc.nextInt();
			int a[]=new int[size];
			int sum=0;
			System.out.println("enter the inputs");
			for(int i=0;i<a.length;i++)//0<3
			{
			 a[i]=sc.nextInt();//a[0]=12,a[1]=13,a[2]=16
			

			}
			for(int temp:a)
			{
				System.out.println(temp);
			}
		}

	}


