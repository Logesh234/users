package Strings;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args)  
		{  
		String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();                       
		for(int i=s.length();i>0;--i)             //1=6 i>1   
		{  
		System.out.print(s.charAt(i-1));            
		}  
	}  
}  

