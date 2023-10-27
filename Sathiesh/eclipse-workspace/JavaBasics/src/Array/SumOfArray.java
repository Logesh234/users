package Array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		
		System.out.println("enter the inputs");
		for(int i=0;i<a.length;i++)
		{
		 a[i]=sc.nextInt();
		 sum=sum+a[i];//0=
		}
		System.out.println("outputs");
		 System.out.println(sum);

	}

	}

