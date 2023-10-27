import java.util.Scanner;

public class MaxNum 
{
	public static int max(int a[])
	{
		Scanner sc=new Scanner(System.in);

		int max=a[0];
		System.out.println("enter input");
		 for(int i=0;i<a.length;i++)//0<5
		  {
			  a[i]=sc.nextInt();//1
			  if(max<a[i])//1<1
				{
					max=a[i];
				}
		  }

		
		return max;
	}

}


