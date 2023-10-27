package Strings;
import java.util.Arrays;
public class StringToChar {

	public class StringsExample {

		public void main(String[] args) {
			String s="hello";
			//char a[]=s.toCharArray();
			//System.out.println(Arrays.toString(a));
			char a[]=new char [4];
			s.getChars(0,3,a,0);//
			System.out.println(Arrays.toString(a));
			

		}

		
	}
}


