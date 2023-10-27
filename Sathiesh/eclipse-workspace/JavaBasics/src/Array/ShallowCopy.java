package Array;
import java.util.Arrays;
public class ShallowCopy {

		public static void main(String[] args) {
		    int a[]= {1,2,3,4};
		    System.out.println(Arrays.toString(a));
		    

		    int a1[]=a;//shallow copy
		    System.out.println(Arrays.toString(a));
		    System.out.println(Arrays.toString(a1));
		    a[1]++;
		    System.out.println(Arrays.toString(a));

		    System.out.println(Arrays.toString(a1));
		    

		}

	}


