package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();
		String reve="";
		for(int i=s.length();i>0;--i)             //1=6 i>1   
		{  
		reve=(reve +s.charAt(i-1));            
		}  
		if (s.toLowerCase().equals(reve.toLowerCase()))
				{
			System.out.println(s + " is a Palindrome String.");
				}
		else
		{
			System.out.println(s + "is not a Palindrome String.");
		}
		
	}  
}


