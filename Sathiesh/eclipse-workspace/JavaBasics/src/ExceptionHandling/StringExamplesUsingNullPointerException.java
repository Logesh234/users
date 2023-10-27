package ExceptionHandling;

public class StringExamplesUsingNullPointerException {

	

		public static void main(String[] args)
		{
			try
			{
			String s=null;
			String s1="hello";
			if(s.equals(s1)) {
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}

		}

	}

