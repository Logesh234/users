package ForLoops;

import java.util.Scanner;

public class PrimeNumber {


			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
				int n=sc.nextInt();//7
				int start=1;
				int fact=0;
				while(start<=n)//1<=7 2<=7 3<=7 4<=7 5<=7
					//6<=7 7<=7
				{
					if(n%start==0)//7%1==0 7%2==0 7%3==0
						//7%4==0 7%5==0 7%6==0 7%7==0
						{
						fact++;//2
					}
					start++;//2
				}
				if(fact==2)
				{
					System.out.println("prime number");
				}
				else
				{
					System.out.println("composite number");
				}

			}

		}
