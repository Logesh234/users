package Array;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");//size as a run time input
		int size=sc.nextInt();
		int a[]=new int[size];
		int temp=0;
		
		System.out.println("enter the inputs");//input as run time input
		for(int i=0;i<a.length;i++)
		{
		 a[i]=sc.nextInt();
		 
		}
		System.out.println("output"); //i/p:21 2 1 43
		for(int i=0;i<a.length;i++) //0<4,
		{
			for(int j=i+1;j<a.length;j++)
			{                                                    // 2 21 1 43  // 1 2 21 43
				
				if (a[i] > a[j]) //21 > 2 // 2 > 1
				{
					temp = a[i];    //temp =21    // temp=2
	                a[i] = a[j];    //a[i]=2      // a[i]=1
	                a[j] = temp;    //a[j]=21     // a[j]=2
	             }
	         }
			
	     } 
		System.out.println("Ascending order");
		for(int i = 0; i < a.length; i++) 
		{
	        System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{ 
				
				if (a[i] < a[j]) 
				{
					temp = a[i];    
	                a[i] = a[j];    
	                a[j] = temp;
	             }
	         }
			
	     } 
		System.out.println("Descending order");
		for(int i = 0; i < a.length; i++) 
		{
	        System.out.println(a[i]);
	        
		}
	


	}
}

