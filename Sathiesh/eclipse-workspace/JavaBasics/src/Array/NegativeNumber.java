package Array;
import java.util.Scanner;
public class NegativeNumber {

		 public static void main(String[] args) 
			{
		    	Scanner sc= new Scanner(System.in);
				System.out.print("Enter the size of the array: ");
			    int size = sc.nextInt();
		        int a[]  = new int[size];
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < size; i++) 
		        {
				   a[i] = sc.nextInt();
				 }
		                int positiveCount = 0;
				        int negativeCount = 0;
				        int evenCount = 0;
				        int oddCount = 0;
		                for (int num :a) 
		               {
				            if (num > 0) 
				            {
				                positiveCount++;
				            } else if (num < 0) 
				            {
				                negativeCount++;
				            }

				            if (num % 2 == 0)
				            {
				                evenCount++;
				            } else {
				                oddCount++;
				            }
				        }
		    
				        System.out.println("Occurrences in the array:");
				        System.out.println("Positive: " + positiveCount);
				        System.out.println("Negative: " + negativeCount);
				        System.out.println("Even: " + evenCount);
				        System.out.println("Odd: " + oddCount);
				        
				    }
				}


