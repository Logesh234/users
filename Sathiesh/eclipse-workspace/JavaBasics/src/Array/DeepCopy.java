package Array;
import java.util.Arrays;
public class DeepCopy {

	public static void main(String[] args) {
			
		    int a[]= {1,2,3,4};
		  
		    

		    int a1[]=a.clone();//deep copy
		    System.out.println(Arrays.toString(a));
		    System.out.println(Arrays.toString(a1));
		    a[0]++;
		    System.out.println(Arrays.toString(a));

		    System.out.println(Arrays.toString(a1));
		    

		}

	




}

