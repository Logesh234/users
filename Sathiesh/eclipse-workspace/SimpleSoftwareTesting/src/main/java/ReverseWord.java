
public class ReverseWord {
	
		public static String reverse(String word)
		{
			String res="";
			for(int i=word.length()-1;i>=0;i--)
			{
				 res=res+word.charAt(i);
			}
			return res;
		}

	}


