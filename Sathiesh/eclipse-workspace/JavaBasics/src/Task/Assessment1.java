package Task;

public class Assessment1 {

	public static void main(String[] args) {
		String str1 ="I Am in Amsterdam am I?";
		str1 = str1.toLowerCase();//
		int count=0;
		for(int i=0;i<=str1.length()-4;i++)//0<19
		{
			if(str1.substring(i,i+4).equals( " am "))//0,
			{
				count++;//2
			}
			
		}
		System.out.println(count);
	}

}

