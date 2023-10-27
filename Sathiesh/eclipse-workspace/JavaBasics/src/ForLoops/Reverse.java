package ForLoops;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,r=0;
		while(n!=0)
		{
			a=n%10;//321//1
			r=r*10+a;//0*10+1=1//1*10+2=12//12*10+3=123
			n=n/10;
		}
		System.out.println(r);

	}

}
