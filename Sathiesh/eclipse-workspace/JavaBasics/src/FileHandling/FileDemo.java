package FileHandling;


		import java.io.File;
		import java.io.IOException;

		public class FileDemo {

			public static void main(String[] args) throws IOException {
		       File f=new File("newCC.txt");
		       if(f.createNewFile())
		       {
		    	   System.out.println("created");
		       }
		       else
		       {
		    	   System.out.println("already exists");
		       }
			}

		}

