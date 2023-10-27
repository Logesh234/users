package Task;

public class Assessment2 {
	 public static int inf_string(String a, String b)
	  {


	  // return 1 if the string 'a' can be contained in 'b'.
	  boolean q=false;
	  if(a!=null){
	  q=b.contains(a);
	  }
	  if(q){
	   return 1;
	 }
	 else{
	 return 0;
	 }
	  
	  }
	
	      public static void main(String[] args) throws IOException {
			{
				 int t;
				 BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
				 t =Integer.parseInt(input.readLine());//2
				
				
				 while(t > 0)//2>0
				 {
				 String a = input.readLine();//abcd
				 String b = input.readLine();//abcdabcd
				 //System.out.println("a value"+a);
				 int ans = inf_string(a, b);
				 if(ans == 1)
				 {
				 System.out.println("YES");
				 }
				 else
				 {
				 System.out.println("NO");
				 }
				 t--;
				 }
				 }
		 }

		}
}
