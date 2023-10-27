package Exception;

public class ArithmeticException {

	public static void main(String[] args) {
		
				int i=9,j=3;int k=0;
			        try
			        {
					k=i/j;
			        }
			        catch(ArithmeticException e)
			        {
			        	System.out.println(e);
			        }
			        finally
			        {
			        	System.out.println(k);
			        	System.out.println("hello");
			        }
				
				
			}

		}




