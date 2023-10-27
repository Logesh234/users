package ForLoops;

import java.util.Scanner;

public class Geograpical {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();//5
		System.out.println("enter the nth power you need");
		int n=sc.nextInt();//3
		
		int sum=0;
		for(int i=0;i<=n;i++) //0<=3 1<=3 2<=3 3<=3
		{
			int go=(int)Math.pow(x, i);//go=pow(5,0)=1 ,pow(5,1)=5 pow(5,2)=25 pow(5,3)=125
			 sum=sum+go;
			}
		
       System.out.println(sum);
		

	}

}
