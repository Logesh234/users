package Array;
import java.util.Scanner;
public class SecLargestNumber {

	public static void main(String[] args) {
	     int a[] = {12, 35, 1, 10, 34, 1};

			        if (a.length < 2) {
			            System.out.println("Array should have at least two elements to find the second largest.");
			        }

			        int firstLargest = a[0]; // Initialize firstLargest and secondLargest
			        int secondLargest = a[1];

			        if (secondLargest > firstLargest) {
			            // Swap firstLargest and secondLargest
			            int temp = firstLargest;
			            firstLargest = secondLargest;
			            secondLargest = temp;
			        }

			        for (int i = 2; i < a.length; i++) {
			            if (a[i] > firstLargest) {
			                secondLargest = firstLargest;
			                firstLargest = a[i];
			            } else if (a[i] > secondLargest && a[i] != firstLargest) {
			                secondLargest = a[i];
			            }
			        }

			        System.out.println("The second largest value in the array is: " + secondLargest);
			    }
			}
