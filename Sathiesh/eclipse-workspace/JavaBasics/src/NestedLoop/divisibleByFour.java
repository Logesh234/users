package NestedLoop;
import java.util.Scanner;

public class divisibleByFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		for(i=7;i<=100;i++)
		{
			if(i%4==0)
			{
				if((i%5==4) && (i%6==4))//5*12=60 R=4 // 6*10=60 R=4
				{
					System.out.println(i);
				}
				
			}
		}
		
		
	}

}
