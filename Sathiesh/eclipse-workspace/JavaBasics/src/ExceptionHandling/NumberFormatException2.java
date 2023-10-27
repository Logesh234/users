package ExceptionHandling;

public class NumberFormatException2 {


		public static void main(String[] args) {
			String s="hello";
					
			try
			{
					int i=Integer.parseInt(s);
					System.out.println(i);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}

		}

	}

