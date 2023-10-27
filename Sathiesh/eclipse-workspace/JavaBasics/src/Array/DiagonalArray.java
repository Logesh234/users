package Array;

import java.util.Scanner;

public class DiagonalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and col");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int s=0,n;
		System.out.println("inputs");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				                  
			{
				a[i][j]=sc.nextInt();
				                  
			}
			
		}
		 for(int i=0;i<col;i++)
		    {
		        for(int j=0;j<col;j++)
		        {
		            if(i==j )
		            {
		            	 System.out.println(a[i][j]);
		            }
		            else
		            {
		            	 System.out.println(" ");
		            }
		            
		        }
		    }

	}

}
