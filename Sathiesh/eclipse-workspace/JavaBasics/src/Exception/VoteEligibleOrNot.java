package Exception;

import java.util.Scanner;

public class VoteEligibleOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int n=sc.nextInt();
		if(n>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			 try
	    	   {
	    	   throw new NotEligibleForVoteException("not eligible for vote");
	    	   }
	    	   catch(NotEligibleForVoteException e)
	    	   {
	    		   System.out.println(e);
	    	   }
	       }
		
		}

	}

