package FileHandling;


		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;

		public class ReadExample {

			public static void main(String[] args) throws IOException {
		       FileInputStream fin=new FileInputStream("newdd.txt");
		       int i;
		       while((i=fin.read())!=-1)
		       {
		           System.out.println((char)i);

		       }
		       
			}

		}

