package Array;

import java.util.Scanner;

public class JavaGreatest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//4
		int a[]=new int[size];//a[0]=1,a[1]=2,a[2]=5,a[3]=6
		int max=a[0];//max=1
		for(int i=0;i<a.length;i++)//0<4 1<4 2<4 3<4
		{
			a[i]=sc.nextInt();//a[0]=1,a[1]=2,a[2]=5,a[3]=6
			if(max<a[i])//1<1 1<2=t 2<5 5<6
			{
				max=a[i];//max=2 max=5 max=6
			}
		}
		System.out.println("The max=:"+max);//6

	}

}
