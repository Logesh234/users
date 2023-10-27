package Array;
import java.util.Scanner;
public class DemoTwoD {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and col");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("inputs");
		for(int i=0;i<row;i++)//0<2 1<2
		{
			for(int j=0;j<col;j++)//0<2 1<2 2<2=f
				                  //0<2
			{
				a[i][j]=sc.nextInt();//a[0][0]=1 a[0][1]=2
				                    //a[1][0]=3 a[1][1]=4
			}
			
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}

