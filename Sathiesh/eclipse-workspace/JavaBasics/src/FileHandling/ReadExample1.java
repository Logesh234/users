package FileHandling;


	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	public class ReadExample1 {

		public static void main(String[] args) throws IOException {
	       FileReader fin=new FileReader("newdd.txt");
	       BufferedReader bin=new BufferedReader(fin);
	       int i;
	       while((i=bin.read())!=-1)
	       {
	           System.out.println((char)i);

	       }
	       
		}

	}


