package LambadaExp;

	import java.util.function.BiFunction;

	public class MultiplicationExample {
		public static int multiply(int a, int b){  
			return a*b;  
		   }  

		public static void main(String[] args) {
			BiFunction<Integer, Integer, Integer> product = MultiplicationExample::multiply;  
			int pr = product.apply(11, 5);  
			System.out.println("Product of given number is: "+pr);  


		}

	}
